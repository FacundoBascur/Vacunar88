-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 20:21:24
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar88`
--
CREATE DATABASE IF NOT EXISTS `vacunar88` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunar88`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centrovacunacion`
--

CREATE TABLE `centrovacunacion` (
  `codCentro` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `zona` varchar(25) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `centrovacunacion`
--

INSERT INTO `centrovacunacion` (`codCentro`, `nombre`, `zona`, `estado`) VALUES
(1, 'Hospital Francisco Lopez Lima', 'Sur', 1),
(2, 'Clinica Roca', 'Este', 0),
(3, 'Juan 23', 'Oeste', 1),
(4, 'Villa Vatteone', 'Norte', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` varchar(20) NOT NULL,
  `codCentro` int(11) NOT NULL,
  `fechaHoraVac` datetime DEFAULT NULL,
  `nroSerieDosis` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`codCita`, `dni`, `codRefuerzo`, `fechaHoraCita`, `codCentro`, `fechaHoraVac`, `nroSerieDosis`, `estado`) VALUES
(1, 11222333, 1, '2023-10-28 15:06', 1, NULL, 21, 1),
(2, 23099111, 1, '2023-11-04 15:17', 3, '2023-11-04 15:17:00', 31, 0),
(3, 23099111, 2, '2023-11-29 15:17', 3, '2023-11-29 15:17:00', 32, 0),
(4, 23099111, 3, '2023-12-24 15:17', 3, '2023-12-24 15:17:00', 33, 0),
(5, 19008833, 1, '2023-11-01 15:19', 3, NULL, 34, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(11) NOT NULL,
  `nombreCompleto` varchar(40) NOT NULL,
  `email` varchar(20) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `zona` varchar(25) NOT NULL,
  `patologia` varchar(20) DEFAULT NULL,
  `ambitoTrabajo` varchar(30) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `nombreCompleto`, `email`, `celular`, `zona`, `patologia`, `ambitoTrabajo`, `estado`) VALUES
(11222333, 'Francisco Martin', 'fran@gmail.com', '00991122', 'Sur', 'S/P', 'Construccion', 1),
(19008833, 'Rodriguez Sofia', 'rsof@gmail.com', '11234567', 'Oeste', 'Asma', 'Jubilado', 1),
(23099111, 'Romero Lucas', 'rom@gmail.com', '9988111', 'Oeste', 'S/P', 'Emprendedor', 1),
(37020921, 'Torres Valentina', 'val@gmail.com', '11776655', 'Este', 'Diabetes', 'Comercio', 1),
(39000222, 'Martinez Esteban', 'est@gmail.com', '2984002211', 'Norte', 'S/P', 'Sector privado', 1),
(40987225, 'Vargas Ismael', 'rsof@gmail.com', '11009922', 'Este', 'Asma', 'Estudiante', 1),
(99222333, 'Ramirez Felipe', 'felipe@gmail.com', '2984567788', 'Sur', 'Artritis', 'Salud', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `cuit` int(11) NOT NULL,
  `nombreLab` varchar(50) NOT NULL,
  `pais` varchar(20) NOT NULL,
  `domicilioCom` varchar(30) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`cuit`, `nombreLab`, `pais`, `domicilioCom`, `marca`, `estado`) VALUES
(30117786, 'AstraZeneca plc', 'Inglaterra', ' Cambridge, Inglaterra', 'Astrazeneca', 1),
(30123339, 'Moderna INC', 'Estados Unidos', 'Cambridge, Massachusetts', 'Moderna', 1),
(30123456, 'Beijing Institute of Biological Products', 'China', 'No. 6, 2nd Boxing Road, Beijin', 'Sinopharm', 1),
(30213339, 'BioNTech-Pfizer', 'Alemania', 'Maguncia, Renania-Palatinado', 'Pfizer', 1),
(30400238, 'Instituto de Investigación Gamaleya', 'Rusia', 'Calle Gamaleya, Moscú', 'Sputnik V', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `medida` double NOT NULL,
  `fechaVenc` date NOT NULL,
  `colocada` tinyint(1) NOT NULL,
  `cuit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`nroSerieDosis`, `marca`, `medida`, `fechaVenc`, `colocada`, `cuit`) VALUES
(1, 'Sputnik V', 0.5, '2024-04-27', 1, 30400238),
(2, 'Sputnik V', 0.5, '2024-04-27', 1, 30400238),
(3, 'Sputnik V', 0.5, '2024-04-27', 1, 30400238),
(4, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(5, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(6, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(7, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(8, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(9, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(10, 'Sputnik V', 0.5, '2024-04-27', 0, 30400238),
(11, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(12, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(13, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(14, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(15, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(16, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(17, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(18, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(19, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(20, 'Moderna', 0.5, '2024-06-27', 0, 30123339),
(21, 'Astrazeneca', 0.5, '2024-05-27', 1, 30117786),
(22, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(23, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(24, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(25, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(26, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(27, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(28, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(29, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(30, 'Astrazeneca', 0.5, '2024-05-27', 0, 30117786),
(31, 'Sinopharm', 0.5, '2024-05-27', 1, 30123456),
(32, 'Sinopharm', 0.5, '2024-05-27', 1, 30123456),
(33, 'Sinopharm', 0.5, '2024-05-27', 1, 30123456),
(34, 'Sinopharm', 0.5, '2024-05-27', 1, 30123456),
(35, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(36, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(37, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(38, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(39, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(40, 'Sinopharm', 0.5, '2024-05-27', 0, 30123456),
(41, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(42, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(43, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(44, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(45, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(46, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(47, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(48, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(49, 'Pfizer', 0.5, '2024-05-27', 0, 30213339),
(50, 'Pfizer', 0.5, '2024-05-27', 0, 30213339);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `centrovacunacion`
--
ALTER TABLE `centrovacunacion`
  ADD PRIMARY KEY (`codCentro`);

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `codCentro` (`codCentro`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `cuit` (`cuit`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centrovacunacion`
--
ALTER TABLE `centrovacunacion`
  MODIFY `codCentro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`nroSerieDosis`) REFERENCES `vacuna` (`nroSerieDosis`),
  ADD CONSTRAINT `citavacunacion_ibfk_3` FOREIGN KEY (`codCentro`) REFERENCES `centrovacunacion` (`codCentro`),
  ADD CONSTRAINT `citavacunacion_ibfk_4` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuit`) REFERENCES `laboratorio` (`cuit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
