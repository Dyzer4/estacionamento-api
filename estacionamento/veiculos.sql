-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/05/2025 às 19:34
-- Versão do servidor: 8.0.40
-- Versão do PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento_rotativo`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `id` int NOT NULL,
  `placa` varchar(7) COLLATE utf8mb4_general_ci NOT NULL,
  `horario_entrada` time NOT NULL,
  `data_entrada` date NOT NULL,
  `horario_saida` time DEFAULT NULL,
  `data_saida` date DEFAULT NULL,
  `forma_pag` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `valor_pago` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `veiculos`
--

INSERT INTO `veiculos` (`id`, `placa`, `horario_entrada`, `data_entrada`, `horario_saida`, `data_saida`, `forma_pag`, `valor_pago`) VALUES
(1, 'aaaa777', '15:12:51', '2025-04-23', '18:58:33', '2025-05-07', 'PIX', 3074),
(2, 'aaaa778', '14:43:30', '2025-05-05', '18:58:40', '2025-05-07', 'PIX', 486),
(3, 'ABC1234', '15:06:37', '2025-05-05', '15:52:46', '2025-05-07', 'DÉBITO', 455),
(4, 'efgh999', '15:12:02', '2025-05-07', '18:58:47', '2025-05-07', 'PIX', 50),
(5, 'iwbf444', '15:13:08', '2025-05-07', '15:52:32', '2025-05-07', 'CRÉDITO', 25),
(6, 'gtyu654', '12:18:11', '2025-05-07', '15:54:23', '2025-05-07', 'PIX', 48),
(7, 'gtyu654', '15:55:38', '2025-05-07', '15:58:10', '2025-05-07', 'DINHEIRO', 25),
(8, 'hfdj234', '16:42:50', '2025-05-07', '16:50:40', '2025-05-07', 'PIX', 25),
(9, 'jfgj', '16:54:29', '2025-05-07', '16:56:20', '2025-05-07', 'PIX', 25),
(10, 'hgfd765', '20:40:29', '2025-05-07', '20:40:58', '2025-05-07', 'CRÉDITO', 25),
(11, 'mnbv234', '20:41:10', '2025-05-07', '20:46:29', '2025-05-07', 'CRÉDITO', 25),
(12, 'fffffff', '16:45:20', '2025-05-12', '16:47:36', '2025-05-12', 'PIX', 25),
(13, 'ACF7777', '15:01:12', '2025-05-14', '15:01:31', '2025-05-14', 'CRÉDITO', 25),
(14, 'ASD0988', '13:06:28', '2025-05-13', '15:07:59', '2025-05-14', 'DINHEIRO', 250);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `veiculos`
--
ALTER TABLE `veiculos`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
