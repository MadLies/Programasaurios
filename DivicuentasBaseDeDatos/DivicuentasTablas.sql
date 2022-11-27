-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema divicuentas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema divicuentas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `divicuentas` DEFAULT CHARACTER SET utf8 ;
USE `divicuentas` ;

-- -----------------------------------------------------
-- Table `divicuentas`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Usuario` (
  `celular` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `nickname` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  `divisa` VARCHAR(3) NULL,
  `email` VARCHAR(255) NULL,
  `contraseña` VARCHAR(45) NULL,
  PRIMARY KEY (`celular`),
  UNIQUE INDEX `Celular_UNIQUE` (`celular` ASC) VISIBLE,
  UNIQUE INDEX `NickName_UNIQUE` (`nickname` ASC) VISIBLE,
  UNIQUE INDEX `Email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Grupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Grupo` (
  `idGrupo` INT NOT NULL AUTO_INCREMENT,
  `nombreGrupo` VARCHAR(45) NULL,
  `descripcionGrupo` VARCHAR(45) NULL,
  PRIMARY KEY (`idGrupo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`UsuarioDelGrupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`UsuarioDelGrupo` (
  `idGrupo` INT NOT NULL,
  `celular` INT NOT NULL,
  PRIMARY KEY (`idGrupo`, `celular`),
  INDEX `fk_Grupo_has_Usuario_Usuario1_idx` (`celular` ASC) VISIBLE,
  INDEX `fk_Grupo_has_Usuario_Grupo_idx` (`idGrupo` ASC) VISIBLE,
  CONSTRAINT `fk_Grupo_has_Usuario_Grupo`
    FOREIGN KEY (`idGrupo`)
    REFERENCES `divicuentas`.`Grupo` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Grupo_has_Usuario_Usuario1`
    FOREIGN KEY (`celular`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Cuenta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Cuenta` (
  `idCuenta` INT NOT NULL AUTO_INCREMENT,
  `nombreCuenta` VARCHAR(45) NOT NULL,
  `fechaCuenta` DATE NOT NULL,
  `totalCuenta` FLOAT NOT NULL,
  `divisaCuenta` VARCHAR(45) NULL,
  `tipoActividad` ENUM('Trabajo', 'Ocio', 'Personal') NULL,
  `adjuntos` JSON NULL,
  `idGrupo` INT NULL,
  PRIMARY KEY (`idCuenta`),
  INDEX `fk_Cuenta_Grupo1_idx` (`idGrupo` ASC) VISIBLE,
  CONSTRAINT `fk_Cuenta_Grupo1`
    FOREIGN KEY (`idGrupo`)
    REFERENCES `divicuentas`.`Grupo` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`IntegranteCuenta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`IntegranteCuenta` (
  `idCuenta` INT NOT NULL,
  `celular` INT NOT NULL,
  `valorPagar` INT NOT NULL,
  `abonado` INT NOT NULL,
  PRIMARY KEY (`idCuenta`, `celular`),
  INDEX `fk_Cuenta_has_Usuario_Usuario1_idx` (`celular` ASC) VISIBLE,
  INDEX `fk_Cuenta_has_Usuario_Cuenta1_idx` (`idCuenta` ASC) VISIBLE,
  CONSTRAINT `fk_Cuenta_has_Usuario_Cuenta1`
    FOREIGN KEY (`idCuenta`)
    REFERENCES `divicuentas`.`Cuenta` (`idCuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cuenta_has_Usuario_Usuario1`
    FOREIGN KEY (`celular`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Pago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `fechaPago` DATE NOT NULL,
  PRIMARY KEY (`idPago`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Transaccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Transaccion` (
  `idTransaccion` INT NOT NULL AUTO_INCREMENT,
  `idCuenta` INT NULL,
  `idPago` INT NULL,
  `valorTransaccion` INT NOT NULL,
  `usuarioSalida` INT NOT NULL,
  `usuarioLlegada` INT NOT NULL,
  PRIMARY KEY (`idTransaccion`),
  INDEX `fk_Transaccion_Cuenta1_idx` (`idCuenta` ASC) VISIBLE,
  INDEX `fk_Transaccion_Pago1_idx` (`idPago` ASC) VISIBLE,
  INDEX `fk_Transaccion_Usuario1_idx` (`usuarioSalida` ASC) VISIBLE,
  INDEX `fk_Transaccion_Usuario2_idx` (`usuarioLlegada` ASC) VISIBLE,
  CONSTRAINT `fk_Transaccion_Cuenta1`
    FOREIGN KEY (`idCuenta`)
    REFERENCES `divicuentas`.`Cuenta` (`idCuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transaccion_Pago1`
    FOREIGN KEY (`idPago`)
    REFERENCES `divicuentas`.`Pago` (`idPago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transaccion_Usuario1`
    FOREIGN KEY (`usuarioSalida`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transaccion_Usuario2`
    FOREIGN KEY (`usuarioLlegada`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Notificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Notificacion` (
  `idNotificacion` INT NOT NULL AUTO_INCREMENT,
  `idCuenta` INT NULL,
  `idPago` INT NULL,
  `usuarioGenera` INT NOT NULL,
  `usuarioRecibe` INT NOT NULL,
  `estado` ENUM('Aceptado', 'Rechazado', 'Espera') NOT NULL DEFAULT 'Espera',
  `mensaje` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idNotificacion`),
  INDEX `fk_Notificacion_Cuenta1_idx` (`idCuenta` ASC) VISIBLE,
  INDEX `fk_Notificacion_Pago1_idx` (`idPago` ASC) VISIBLE,
  INDEX `fk_Notificacion_Usuario1_idx` (`usuarioGenera` ASC) VISIBLE,
  INDEX `fk_Notificacion_Usuario2_idx` (`usuarioRecibe` ASC) VISIBLE,
  CONSTRAINT `fk_Notificacion_Cuenta1`
    FOREIGN KEY (`idCuenta`)
    REFERENCES `divicuentas`.`Cuenta` (`idCuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Notificacion_Pago1`
    FOREIGN KEY (`idPago`)
    REFERENCES `divicuentas`.`Pago` (`idPago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Notificacion_Usuario1`
    FOREIGN KEY (`usuarioGenera`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Notificacion_Usuario2`
    FOREIGN KEY (`usuarioRecibe`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `divicuentas`.`Amigo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divicuentas`.`Amigo` (
  `idAmigo` INT NOT NULL,
  `usuario` INT NOT NULL,
  `amigo` INT NOT NULL,
  `favorito` TINYINT NULL DEFAULT 0,
  PRIMARY KEY (`idAmigo`),
  INDEX `fk_Amigo_Usuario1_idx` (`usuario` ASC) VISIBLE,
  INDEX `fk_Amigo_Usuario2_idx` (`amigo` ASC) VISIBLE,
  CONSTRAINT `fk_Amigo_Usuario1`
    FOREIGN KEY (`usuario`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Amigo_Usuario2`
    FOREIGN KEY (`amigo`)
    REFERENCES `divicuentas`.`Usuario` (`celular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
