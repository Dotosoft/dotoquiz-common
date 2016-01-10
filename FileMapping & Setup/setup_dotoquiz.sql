-- Setup Database
CREATE DATABASE `dotoquiz`;
CREATE USER 'dotouser'@'localhost' IDENTIFIED BY 'dotopassword';
GRANT ALL ON dotoquiz.* TO 'dotouser'@'localhost';
USE `dotoquiz` ;

-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost:8889
-- Generation Time: Jan 06, 2016 at 10:52 PM
-- Server version: 5.5.34
-- PHP Version: 5.5.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `dotoquiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `dat_questions`
--

CREATE TABLE `dat_questions` (
  `id` varchar(50) NOT NULL,
  `correct_answer` varchar(500) DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `question` text DEFAULT NULL,
  `wrong_answer1` varchar(500) DEFAULT NULL,
  `wrong_answer2` varchar(500) DEFAULT NULL,
  `wrong_answer3` varchar(500) DEFAULT NULL,
  `mtQuestionType_id` varchar(50) DEFAULT NULL,
  `picasaId` varchar(100) DEFAULT NULL,
  `imagePicasaUrl` text DEFAULT NULL,
  `additionalData` text DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_s2meoyq57rxdm288w6bbxejnk` (`mtQuestionType_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `dat_topics`
--

CREATE TABLE `dat_topics` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` text,
  `image_url` varchar(200) DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `datTopics_id` varchar(50) DEFAULT NULL,
  `picasaId` varchar(100) DEFAULT NULL,
  `imagePicasaUrl` text DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_topic_parent_idx` (`datTopics_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `dat_topics_questions`
--

CREATE TABLE `dat_topics_questions` (
  `id` varchar(50) NOT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `datQuestions_id` varchar(50) DEFAULT NULL,
  `datTopics_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_4d2pliudlxybsvj18680qgmpv` (`datQuestions_id`),
  KEY `FK_krx39jl524wjhueh6awiyeq5t` (`datTopics_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `log_gameCreated`
--

CREATE TABLE `log_gameCreated` (
  `id` varchar(50) NOT NULL,
  `topicId` varchar(50) DEFAULT NULL,
  `roomId` varchar(50) DEFAULT NULL,
  `userA` varchar(50) DEFAULT NULL,
  `userB` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `updated_dt` datetime DEFAULT NULL,
  `question_data` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_gamecreated_topic_idx` (`topicId`),
  KEY `fk_gamecreated_userA_idx` (`userA`),
  KEY `fk_gamecreated_userB_idx` (`userB`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `log_playQuiz`
--

CREATE TABLE `log_playQuiz` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `gameId` varchar(50) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `reason` text,
  `points` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_logplay_user_idx` (`userId`),
  KEY `fk_logplay_topic_idx` (`gameId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `log_stepPlay`
--

CREATE TABLE `log_stepPlay` (
  `id` varchar(50) NOT NULL,
  `gameId` varchar(50) DEFAULT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `answertime` int(11) DEFAULT NULL,
  `answerdata` text,
  `created_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_step_gameCreated_idx` (`gameId`),
  KEY `fk_step_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mt_achievements`
--

CREATE TABLE `mt_achievements` (
  `id` varchar(50) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` text,
  `image_url` text DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `picasaId` varchar(100) DEFAULT NULL,
  `image_picasa_url` text DEFAULT NULL,
  `is_delete` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `mt_country`
--

CREATE TABLE `mt_country` (
  `id` varchar(2) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `url` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE,
  KEY `url` (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table `mt_question_type`
--

CREATE TABLE `mt_question_type` (
  `id` varchar(50) NOT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `description` text DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `sec_data`
--

CREATE TABLE `sec_data` (
  `id` varchar(50) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `image_url` text DEFAULT NULL,
  `mtCountry_id` varchar(2) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `exp` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_data_country_idx` (`mtCountry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `sec_user`
--

CREATE TABLE `sec_user` (
  `id` varchar(50) NOT NULL,
  `is_login` varchar(1) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `updated_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `sec_user_pass`
--

CREATE TABLE `sec_user_pass` (
  `id` varchar(50) NOT NULL,
  `register_ip` varchar(100) DEFAULT NULL,
  `refresh_token` varchar(100) DEFAULT NULL,
  `oauth_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `sos_friends`
--

CREATE TABLE `sos_friends` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `friendId` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_friend_friend_idx` (`friendId`),
  KEY `fk_friend_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_notifications`
--

CREATE TABLE `sos_notifications` (
  `id` varchar(50) NOT NULL,
  `message` text,
  `is_delete` varchar(1) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_notifications_user`
--

CREATE TABLE `sos_notifications_user` (
  `id` varchar(50) NOT NULL,
  `notificationId` varchar(50) DEFAULT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `isRead` varchar(1) DEFAULT NULL,
  `updated_dt` datetime DEFAULT NULL,
  `updated_by` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_notificationUser_user_idx` (`userId`),
  KEY `fk_notificationUser_notification_idx` (`notificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_postings`
--

CREATE TABLE `sos_postings` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `description` text,
  `image_url` text DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_posting_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_postings_comments`
--

CREATE TABLE `sos_postings_comments` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `postingId` varchar(50) DEFAULT NULL,
  `comments` text,
  `created_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_postingComment_posting_idx` (`postingId`),
  KEY `fk_postingComment_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_postings_likes`
--

CREATE TABLE `sos_postings_likes` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `postingId` varchar(50) DEFAULT NULL,
  `is_delete` varchar(1) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_postingLike_posting_idx` (`postingId`),
  KEY `fk_postingLike_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_topic_likes`
--

CREATE TABLE `sos_topic_likes` (
  `id` int(11) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `topicId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_topiclike_topic_idx` (`topicId`),
  KEY `fk_topiclike_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_user_achievement`
--

CREATE TABLE `sos_user_achievement` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `achievementId` varchar(50) DEFAULT NULL,
  `created_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userAchievement_user_idx` (`userId`),
  KEY `fk_userAchievement_achievement_idx` (`achievementId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sos_user_follow`
--

CREATE TABLE `sos_user_follow` (
  `id` varchar(50) NOT NULL,
  `userId` varchar(50) DEFAULT NULL,
  `followerId` varchar(50) DEFAULT NULL,
  `followDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userfollow_follow_idx` (`followerId`),
  KEY `fk_userfollow_user_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dat_questions`
--
ALTER TABLE `dat_questions`
  ADD CONSTRAINT `FK_s2meoyq57rxdm288w6bbxejnk` FOREIGN KEY (`mtQuestionType_id`) REFERENCES `mt_question_type` (`id`);

--
-- Constraints for table `dat_topics`
--
ALTER TABLE `dat_topics`
  ADD CONSTRAINT `fk_topic_parent` FOREIGN KEY (`datTopics_id`) REFERENCES `dat_topics` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `dat_topics_questions`
--
ALTER TABLE `dat_topics_questions`
  ADD CONSTRAINT `FK_4d2pliudlxybsvj18680qgmpv` FOREIGN KEY (`datQuestions_id`) REFERENCES `dat_questions` (`id`),
  ADD CONSTRAINT `FK_krx39jl524wjhueh6awiyeq5t` FOREIGN KEY (`datTopics_id`) REFERENCES `dat_topics` (`id`);

--
-- Constraints for table `log_gameCreated`
--
ALTER TABLE `log_gameCreated`
  ADD CONSTRAINT `fk_gamecreated_topic` FOREIGN KEY (`topicId`) REFERENCES `dat_topics` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gamecreated_userA` FOREIGN KEY (`userA`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gamecreated_userB` FOREIGN KEY (`userB`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `log_playQuiz`
--
ALTER TABLE `log_playQuiz`
  ADD CONSTRAINT `fk_logplay_topic` FOREIGN KEY (`gameId`) REFERENCES `dat_topics` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_logplay_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `log_stepPlay`
--
ALTER TABLE `log_stepPlay`
  ADD CONSTRAINT `fk_step_gameCreated` FOREIGN KEY (`gameId`) REFERENCES `log_gameCreated` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_step_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sec_data`
--
ALTER TABLE `sec_data`
  ADD CONSTRAINT `fk_data_user` FOREIGN KEY (`id`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sec_user_pass`
--
ALTER TABLE `sec_user_pass`
  ADD CONSTRAINT `fk_user_pass` FOREIGN KEY (`id`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_friends`
--
ALTER TABLE `sos_friends`
  ADD CONSTRAINT `fk_friend_friend` FOREIGN KEY (`friendId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_friend_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_notifications_user`
--
ALTER TABLE `sos_notifications_user`
  ADD CONSTRAINT `fk_notificationUser_notification` FOREIGN KEY (`notificationId`) REFERENCES `sos_notifications` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_notificationUser_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_postings`
--
ALTER TABLE `sos_postings`
  ADD CONSTRAINT `fk_posting_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_postings_comments`
--
ALTER TABLE `sos_postings_comments`
  ADD CONSTRAINT `fk_postingComment_posting` FOREIGN KEY (`postingId`) REFERENCES `sos_postings` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_postingComment_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_postings_likes`
--
ALTER TABLE `sos_postings_likes`
  ADD CONSTRAINT `fk_postingLike_posting` FOREIGN KEY (`postingId`) REFERENCES `sos_postings` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_postingLike_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_topic_likes`
--
ALTER TABLE `sos_topic_likes`
  ADD CONSTRAINT `fk_topiclike_topic` FOREIGN KEY (`topicId`) REFERENCES `dat_topics` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_topiclike_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_user_achievement`
--
ALTER TABLE `sos_user_achievement`
  ADD CONSTRAINT `fk_userAchievement_achievement` FOREIGN KEY (`achievementId`) REFERENCES `mt_achievements` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_userAchievement_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sos_user_follow`
--
ALTER TABLE `sos_user_follow`
  ADD CONSTRAINT `fk_userfollow_follow` FOREIGN KEY (`followerId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_userfollow_user` FOREIGN KEY (`userId`) REFERENCES `sec_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
