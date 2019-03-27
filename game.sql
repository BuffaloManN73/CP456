-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2019 at 04:52 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `game`
--

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE `game` (
  `id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `picture` varchar(50) NOT NULL,
  `review` varchar(5000) NOT NULL,
  `score` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `game`
--

INSERT INTO `game` (`id`, `type`, `name`, `picture`, `review`, `score`) VALUES
(1, 'action', 'Farcry5', '1', 'Far Cry 5 is also a less restrictive playground than its predecessors. After a short introduction, you can go to every corner of its world map and take on most of its content. You can go where you want and do what you want. You can hike to a remote spot in the woods and go fishing. You can ignore the game’s story and simply blow shit up.', '4.5'),
(2, 'Action', 'Sekiro™: Shadows Die Twice', '', 'Sekiro is a video game that delights the player with robust, stuffed worlds to explore and strategize, and then forces them to forget all of that to conquer singular, terrible enemies. It pushes and pulls, attacks and releases. It is not connected to the loose cosmology of games in developer FromSoftware’s celebrated oeuvre, but echoes old game design and a nihilistic view of the world. You can analyze it all you want, and probably implant whatever larger meaning you feel you can staple onto it, just like other FromSoft games. Sekiro will laugh.', '4.8'),
(3, 'Action', 'Grand Theft Auto V', '', 'For me, Grand Theft Auto V’s extraordinary scope is summed up in two favourite moments. One is from a mid-game mission in which I flew a plane into another plane, fought the crew, hijacked the thing, and then parachuted out and watched it crash into the sea to escape death at the hands of incoming military fighter jets. Another time, whilst driving around in an off-road buggy, I got distracted by something that looked like a path up one of the San Andreas mountains. Turns out it was a path, and I spent 15 minutes following to the summit, where I nearly ran over a group of hikers. “Typical!” one of them yelled at me, as if he nearly gets run over by a rogue ATV on top of a mountain every time he goes on a hike.', '5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
