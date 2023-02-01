-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-02-2023 a las 07:08:10
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `administracion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

CREATE TABLE `control` (
  `id` int(11) NOT NULL,
  `codigo` varchar(200) NOT NULL,
  `sueldo` double NOT NULL,
  `agip` double NOT NULL,
  `monotributo` double NOT NULL,
  `alquiler` double NOT NULL,
  `celular` double NOT NULL,
  `transporte` double NOT NULL,
  `tarjeta_naranja` double NOT NULL,
  `tarjeta_banco_ciudad` double NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `total_impuesto` double DEFAULT NULL,
  `total_tarjetas` double DEFAULT NULL,
  `total_servicios` double DEFAULT NULL,
  `total_pagar` double DEFAULT NULL,
  `Total_sueldo` double DEFAULT NULL,
  `estado_cuenta` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `control`
--

INSERT INTO `control` (`id`, `codigo`, `sueldo`, `agip`, `monotributo`, `alquiler`, `celular`, `transporte`, `tarjeta_naranja`, `tarjeta_banco_ciudad`, `fecha_ingreso`, `total_impuesto`, `total_tarjetas`, `total_servicios`, `total_pagar`, `Total_sueldo`, `estado_cuenta`) VALUES
(1, 'Enero', 30000, 1350, 3000, 12000, 1000, 1567, 1765, 1432, '2022-01-22', 2580, 3599, 5705, 11884, 77420, 'PAGADO'),
(2, 'Febrero', 30000, 1350, 3432, 12000, 1000, 1567, 1765, 2000, '2022-02-25', 6335, 4999, 2300, 13634, 4365, 'PAGADO'),
(3, 'Marzo', 30000, 1350, 3432, 12000, 1300, 1567, 2000, 1432, '2022-03-28', 6335, 4999, 2300, 13634, 4365, 'PAGADO'),
(5, 'Abril', 30900, 1350, 3432, 15000, 1450, 1567, 2000, 1432, '2022-04-28', 5032, 4789, 21475, 31296, 1104, 'PENDIENTE'),
(7, 'Mayo', 30900, 1350, 3432, 15000, 1300, 1567, 2000, 1432, '2022-05-27', 33334, 2444, 196766, 232544, 989678, 'PAGADO'),
(8, 'Junio', 30900, 1350, 3432, 15000, 1567, 1700, 2500, 1432, '2022-06-16', 4782, 3932, 18267, 26981, 3919, 'PENDIENTE'),
(9, 'Julio', 32400, 1350, 3432, 15000, 1300, 1700, 2500, 1432, '2022-07-24', 2580, 3599, 5705, 11884, 77420, 'PAGADO'),
(10, 'Agosto', 32400, 1600, 3432, 18000, 1690, 1700, 2500, 2089, '2022-08-17', 2580, 3599, 5705, 11884, 77420, 'PAGADO'),
(11, 'Septiembre', 32400, 1600, 3432, 18000, 1690, 1700, 0, 2089, '2022-09-22', 2580, 3599, 5705, 11884, 77420, 'PAGADO'),
(12, 'Octubre', 32400, 1600, 3432, 18000, 1710, 1765, 2700, 2089, '2022-10-22', 5032, 4789, 21475, 31296, 1104, 'PAGADO'),
(13, 'Noviembre', 32400, 1600, 3432, 18000, 1690, 1700, 2700, 2289, '2022-12-24', 5032, 4989, 21390, 31411, 27368, 'PAGADO'),
(14, 'Diciembre', 33450, 1600, 3432, 18000, 1810, 1700, 2700, 2289, '2022-12-22', 5032, 4989, 21510, 31531, 6908, 'PAGADO'),
(17, 'Enero', 38450, 1630, 3600, 20000, 1900, 1800, 2700, 2089, '2023-01-01', 5230, 4789, 23700, 33719, 4731, 'PAGADO'),
(18, 'Febrero', 38450, 1630, 3600, 20000, 1900, 1800, 2700, 2089, '2023-02-01', 5230, 4789, 23700, 33719, 4731, 'PENDIENTE');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `control`
--
ALTER TABLE `control`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `control`
--
ALTER TABLE `control`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
