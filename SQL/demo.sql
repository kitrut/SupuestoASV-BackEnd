CREATE DATABASE  IF NOT EXISTS `asvcafeteria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `asvcafeteria`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: asvcafeteria
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `linea_pedido`
--

DROP TABLE IF EXISTS `linea_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `linea_pedido` (
  `id_linea_pedido` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` double DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `pedido_id_pedido` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_linea_pedido`),
  KEY `FKto692qfqfqa0g1s45lb0lbl4q` (`pedido_id_pedido`)
) ENGINE=MyISAM AUTO_INCREMENT=114 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linea_pedido`
--

LOCK TABLES `linea_pedido` WRITE;
/*!40000 ALTER TABLE `linea_pedido` DISABLE KEYS */;
INSERT INTO `linea_pedido` VALUES (103,2,'Fruta',1,44),(102,4,'Helado',1.5,44),(101,3,'Natillas',1.5,44),(100,1,'Fideuá',4,44),(99,4,'Bola de helado de fresa',1.5,44),(98,2,'Flan',1.5,44),(78,4,'Boletus',2.4,40),(79,1,'Entrecot',10,41),(80,1,'Atún',2.4,41),(81,1,'Chipirones',5,41),(82,1,'Boletus',2.4,41),(83,1,'Ensalada',3,41),(84,2,'Bacalao',3.25,42),(85,1,'Boletus',2.4,42),(86,1,'Atún',2.4,42),(87,1,'Chipirones',5,42),(88,1,'Ensalada',3,42),(89,3,'Escalope',5,42),(90,3,'Entrecot',10,42),(91,2,'Merluza en salsa',3.25,43),(92,2,'Lentejas',4,43),(93,1,'Pechuga de pollo',4,43),(94,6,'Escalope',5,43),(95,2,'Bacaladilla',3.25,43),(96,2,'Fideuá',4,43),(97,4,'Bacalao',3.25,43),(104,1,'Atún',2.4,45),(105,1,'Boletus',2.4,45),(106,1,'Ensalada',3,45),(107,1,'Chipirones',5,45),(108,1,'Entrecot',10,45),(109,2,'Boletus',2.4,46),(110,1,'Ensalada',3,46),(111,1,'Aceitunas',1,46),(112,2,'Atún',2.4,46),(113,2,'Chipirones',5,46);
/*!40000 ALTER TABLE `linea_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pedido` (
  `id_pedido` bigint(20) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `state` bigint(20) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `fechaentrega` datetime DEFAULT NULL,
  PRIMARY KEY (`id_pedido`),
  KEY `FKa7sbo9tsvg4v0tltogeuoxf5u` (`state`)
) ENGINE=MyISAM AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (44,'2019-06-14 19:50:27','Manu',NULL,0,25.5,'2019-06-15 19:50:27'),(45,'2019-06-14 20:50:37','Manu',NULL,0,22.8,'2019-06-15 20:50:37'),(46,'2019-06-14 20:53:17','Manu',NULL,0,23.6,'2019-06-15 20:53:17'),(40,'2019-06-14 18:54:44','Manu',NULL,0,9.6,'2019-06-14 18:54:44'),(41,'2019-06-14 19:26:44','Manu',NULL,1,22.8,'2019-06-14 19:26:44'),(42,'2019-06-14 19:27:23','Manu',NULL,2,64.3,'2019-06-15 19:27:23'),(43,'2019-06-14 19:35:38','Manu',NULL,3,76,'2019-06-15 19:35:38');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plato`
--

DROP TABLE IF EXISTS `plato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `plato` (
  `id_plato` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_plato`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plato`
--

LOCK TABLES `plato` WRITE;
/*!40000 ALTER TABLE `plato` DISABLE KEYS */;
INSERT INTO `plato` VALUES (1,'Entrecot',10,0),(2,'Helado',1.5,2),(3,'Bacalao',3.25,1),(4,'Flan',1.5,2),(5,'Natillas',1.5,2),(6,'Fruta',1,2),(7,'Ensalada',3,0),(8,'Gazpacho',2,0),(9,'Mejillones',4,0),(10,'Chipirones',5,0),(11,'Pechuga de pollo',4,1),(12,'Escalope',5,1),(33,'Merluza en salsa',3.25,1),(15,'Tortilla de patata',3,0),(16,'Lentejas',4,1),(17,'Fideuá',4,1),(32,'Bacaladilla',3.25,1),(25,'Judías',2,0),(26,'Yogurt',1,2),(28,'Puré calabacín',3.5,0),(34,'Boletus',2.4,0),(30,'Sandwitch de nata',2,2),(35,'Bola de helado de fresa',1.5,2),(39,'Atún',2.4,0),(40,'Aceitunas',1,0);
/*!40000 ALTER TABLE `plato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-14 22:45:27
