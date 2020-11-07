-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.3.16-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para aluguel
DROP DATABASE IF EXISTS `aluguel`;
CREATE DATABASE IF NOT EXISTS `aluguel` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `aluguel`;

-- Copiando estrutura para tabela aluguel.alu_aluguel
DROP TABLE IF EXISTS `alu_aluguel`;
CREATE TABLE IF NOT EXISTS `alu_aluguel` (
  `alu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `alu_ajuste` varchar(255) DEFAULT NULL,
  `alu_data_devolucao` date DEFAULT NULL,
  `alu_data_locacao` date DEFAULT NULL,
  `alu_data_retirada` date DEFAULT NULL,
  `cli_id` bigint(20) DEFAULT NULL,
  `usu_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`alu_id`),
  KEY `FKnpm25vfbrqllscboa3mwmg5xf` (`cli_id`),
  KEY `FKi0abjlocaje04t8uk5hjv6ekw` (`usu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela aluguel.alu_recebe
DROP TABLE IF EXISTS `alu_recebe`;
CREATE TABLE IF NOT EXISTS `alu_recebe` (
  `alu_id` bigint(20) NOT NULL,
  `item_id` bigint(20) NOT NULL,
  PRIMARY KEY (`alu_id`,`item_id`),
  KEY `FKe2lmblus6pfu2upsqbyq21xy6` (`item_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela aluguel.alu_roupa
DROP TABLE IF EXISTS `alu_roupa`;
CREATE TABLE IF NOT EXISTS `alu_roupa` (
  `rou_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `item_cor` varchar(255) DEFAULT NULL,
  `item_preco` double DEFAULT NULL,
  `item_sexo` varchar(255) DEFAULT NULL,
  `rou_tamanho` varchar(255) DEFAULT NULL,
  `rou_tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rou_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela aluguel.cli_cliente
DROP TABLE IF EXISTS `cli_cliente`;
CREATE TABLE IF NOT EXISTS `cli_cliente` (
  `cli_bairro` varchar(255) DEFAULT NULL,
  `cli_cidade` varchar(255) DEFAULT NULL,
  `cli_idade` int(11) DEFAULT NULL,
  `cli_numero` int(11) DEFAULT NULL,
  `cli_rua` varchar(255) DEFAULT NULL,
  `cli_telefone` varchar(255) DEFAULT NULL,
  `pess_id` bigint(20) NOT NULL,
  PRIMARY KEY (`pess_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela aluguel.pe_pessoa
DROP TABLE IF EXISTS `pe_pessoa`;
CREATE TABLE IF NOT EXISTS `pe_pessoa` (
  `pess_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pe_cpf` varchar(255) DEFAULT NULL,
  `pe_email` varchar(255) DEFAULT NULL,
  `pe_nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pess_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela aluguel.usu_usuario
DROP TABLE IF EXISTS `usu_usuario`;
CREATE TABLE IF NOT EXISTS `usu_usuario` (
  `usu_senha` varchar(255) DEFAULT NULL,
  `pess_id` bigint(20) NOT NULL,
  PRIMARY KEY (`pess_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
