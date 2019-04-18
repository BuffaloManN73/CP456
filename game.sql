-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2019 at 07:37 PM
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
(1, 'Action', 'Farcry5', '1', 'Far Cry 5 is also a less restrictive playground than its predecessors. After a short introduction, you can go to every corner of its world map and take on most of its content. You can go where you want and do what you want. You can hike to a remote spot in the woods and go fishing. You can ignore the game’s story and simply blow shit up.', '4.5'),
(2, 'Action', 'Sekiro™: Shadows Die Twice', '2', 'Sekiro is a video game that delights the player with robust, stuffed worlds to explore and strategize, and then forces them to forget all of that to conquer singular, terrible enemies. It pushes and pulls, attacks and releases. It is not connected to the loose cosmology of games in developer FromSoftware’s celebrated oeuvre, but echoes old game design and a nihilistic view of the world. You can analyze it all you want, and probably implant whatever larger meaning you feel you can staple onto it, just like other FromSoft games. Sekiro will laugh.', '4.8'),
(3, 'Action', 'Grand Theft Auto V', '3', 'For me, Grand Theft Auto V’s extraordinary scope is summed up in two favourite moments. One is from a mid-game mission in which I flew a plane into another plane, fought the crew, hijacked the thing, and then parachuted out and watched it crash into the sea to escape death at the hands of incoming military fighter jets. Another time, whilst driving around in an off-road buggy, I got distracted by something that looked like a path up one of the San Andreas mountains. Turns out it was a path, and I spent 15 minutes following to the summit, where I nearly ran over a group of hikers. “Typical!” one of them yelled at me, as if he nearly gets run over by a rogue ATV on top of a mountain every time he goes on a hike.', '5'),
(4, 'rpg', 'Stardew Valley', '4', 'On the surface, Stardew Valley is a game about farming, but there are more adventures awaiting curious players beyond cultivating a rich and bountiful garden. From mining and fishing to making friends and falling in love, Stardew Valley\'s Pelican Town is stuffed with rewarding opportunities. As modern day woes give way to pressing matters on the farm and within your newfound community, Stardew Valley\'s meditative activities often lead to personal reflection in the real world. It’s a game that tugs at your curiousity as often as it does your heart.', '4.7'),
(5, 'rpg', 'Monster Hunter: World', '5', 'Monster Hunter has always been a series that offers much and more. Its games are, broadly speaking, action-RPGs built around a single gameplay loop. Like in many modern crafting games you begin with nothing but a flimsy weapon and the chainmail on your back, but as you take on monster-hunting quests you harvest materials from your prey and the environments they live in, use them to build stronger gear, and then use them to take on stronger monsters to get even more gear. The beauty is in how many ways it offers for you complete that loop.', '4.7'),
(6, 'rpg', 'Jump Force', '6', 'Jump Force lifts from the 50 year history of Shonen Jump magazine, a publication that has been the home of some genuinely legendary manga series: Fist of the North Star, JoJo’s Bizarre Adventure, Naruto and bloody Dragon Ball. These are all stories that revolve around their protagonists getting in fights, so you’d think Jump Force would be an easy win. A Smash Bros-esque big brawl featuring all its most important icons should be easy to recommend, but unfortunately it won\'t leave devotees of any series jumping for joy.', '3.1'),
(7, 'simulation', 'Farming Simulator 19', '7', 'Farming Simulator 19 takes players to a rustic, country backside and gives them the opportunity to be whatever type of farmer they wish. Published by Focus Home Interactive, Farming Simulator 19 lets players take care of crops, raise livestock, or try their hands at forestry, but this freedom of choice is a double-edged sword. It is both the game’s greatest and worst feature, because it makes the big and beautiful world feel as if there was little to do and too much to do at the same time.', '3.5'),
(8, 'simulation', 'Train Simulator 2019', '8', 'Developed by Dovetail Games, the series\'s new game is not so much of a great deal of innovation, but there is exciting new content for the players who follow the series closely. At the end of the day, I hear you say “this is just a train, it goes forward and backward”. But it is necessary to say that a great craft lies beneath being a mechanic. Even though today\'s machines are gradually delivered to the hands of artificial intelligence, Train Simulator 2019 teaches you more than how to use trains. Besides the mechanical and digital parts of the trains, you can be sure that you will learn much information you never knew in this game.', '1.5'),
(9, 'simulation', 'Hand Simulator', '9', 'Hand Simulator is the third game in a series of life simulation releases created by HFM Games. As you might have guessed from the title, this game allows you to assume the role of your own hands!  If it sounds weird, it’s because it is. But we think that in the most positive way possible since this release is incredibly addictive and funny!', '3.5');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `game1` int(11) NOT NULL,
  `game2` int(11) NOT NULL,
  `game3` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
