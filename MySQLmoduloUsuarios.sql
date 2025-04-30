DELETE FROM `prueba`.`usuario` WHERE (`usuarioID` = '4')
SELECT * FROM prueba.usuario
SELECT * FROM prueba.usuario
SELECT * FROM prueba.usuario
ALTER TABLE `prueba`.`usuario` 
CHANGE COLUMN `UsuarioID` `usuarioID` INT NOT NULL
SELECT * FROM prueba.usuario
SELECT * FROM prueba.usuario
ALTER TABLE `prueba`.`usuario` 
ADD COLUMN `celularUsuario` INT NOT NULL AFTER `correoUsuario`,
ADD COLUMN `direccionUsuario` VARCHAR(45) NOT NULL AFTER `celularUsuario`,
CHANGE COLUMN `usuariocol` `correoUsuario` VARCHAR(45) NOT NULL
SELECT * FROM prueba.usuario
SELECT * FROM prueba.usuario
ALTER TABLE `prueba`.`usuarios` 
 CHANGE COLUMN `id` `UsuarioID` INT NOT NULL ,
 CHANGE COLUMN `nomusu` `nombreUsuario` VARCHAR(45) NULL DEFAULT NULL ,
 CHANGE COLUMN `passusu` `correoUsuario` VARCHAR(45) NULL DEFAULT NULL
CREATE TABLE `prueba`.`usuario` (
 )
 COMMENT = 'usuarios'
CREATE TABLE `prueba`.`usuario` (
 )
CREATE TABLE `prueba`.`usuarios` (
 )
DROP TABLE `prueba`.`usuarios`
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('4', 'Patricia', '3333')
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('4', 'Patricia', '3333')
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('4', 'Patricia', '3333')
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('4', 'Patricia', '3333')
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('3', 'Pedro', '2590')
INSERT INTO `prueba`.`usuarios` (`id`, `nomusu`, `passusu`) VALUES ('1', 'Maria', '567')
ALTER TABLE `prueba`.`usuarios` 
 ADD COLUMN `passusu` VARCHAR(45) NULL AFTER `nomusu`,
 CHANGE COLUMN `idusuarios` `id` INT NOT NULL ,
 CHANGE COLUMN `usuarioscol` `nomusu` VARCHAR(45) NULL DEFAULT NULL
CREATE TABLE `prueba`.`usuarios` (
   `idusuarios` INT NOT NULL,
   `usuarioscol` VARCHAR(45) NULL,
   PRIMARY KEY (`idusuarios`))
 ENGINE = InnoDB
CREATE TABLE `prueba`.`usuarios` (
 )
CREATE SCHEMA `prueba`
