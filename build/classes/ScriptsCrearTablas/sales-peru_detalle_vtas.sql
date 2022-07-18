-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sales-peru
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detalle_vtas`
--

DROP TABLE IF EXISTS `detalle_vtas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_vtas` (
  `dvta_id` varchar(30) NOT NULL,
  `dvta_cantidad` decimal(10,2) DEFAULT NULL,
  `dvta_producto` varchar(50) DEFAULT NULL,
  `dvta_precio_unitario` decimal(10,2) DEFAULT NULL,
  `dvta_precio_subtotal` decimal(10,2) DEFAULT NULL,
  `dvta_vta_id` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dvta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_vtas`
--

LOCK TABLES `detalle_vtas` WRITE;
/*!40000 ALTER TABLE `detalle_vtas` DISABLE KEYS */;
INSERT INTO `detalle_vtas` VALUES ('01658122345189',2.00,'Zampoña - 44',44.00,88.00,'1658122345190'),('01658123308851',2.00,'Xilófono - 47',12.00,24.00,'1658123308851'),('01658123387274',2.00,'Trompeta - 596',507.00,1014.00,'1658123387274'),('01658123832029',2.00,'Orgánico Electrónico - 949',23.00,46.00,'1658123832030'),('01658123878061',2.00,'Guitarra acústica - 149',12.00,24.00,'1658123878061'),('01658123908827',2.00,'Guitarra acústica - 149',123.00,246.00,'1658123908827'),('01658123942357',2.00,'Yamaha Flauta YRS-20GB - 35',25.00,50.00,'1658123942357'),('01658124745093',3.00,'Tambor Bombo Folclórico con cuero - 329',23.00,69.00,'1658124745094'),('01658124792016',3.00,'Orgánico Electrónico - 949',23.00,69.00,'1658124792016'),('01658131021586',2.00,'Trompeta - 596',234.00,468.00,'1658131021586'),('01658131037319',2.00,'Trompeta - 596',23.00,46.00,'1658131037319'),('01658131159729',4.00,'Zampoña - 44',2.00,8.00,'1658131159729'),('01658131195677',5.00,'Zampoña - 44',23.00,115.00,'1658131195677'),('01658133512269',3.00,'Guitarra acústica - 149',149.00,447.00,'1658133512269'),('11658122345190',4.00,'Guitarra acústica - 149',149.00,596.00,'1658122345190'),('11658123908827',2.00,'Orgánico Electrónico - 949',123.00,246.00,'1658123908827'),('11658124792016',3.00,'Yamaha Flauta YRS-20GB - 35',24.00,72.00,'1658124792016'),('21658124792016',4.00,'Zampoña - 44',98.00,392.00,'1658124792016');
/*!40000 ALTER TABLE `detalle_vtas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-18  9:01:42
