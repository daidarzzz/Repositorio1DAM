# Práctica 1: Sistema de Pago para E-commerce

## 📋 Índice
1. [Introducción](#introducción)
2. [Objetivo de la práctica](#objetivo-de-la-práctica)
3. [Conceptos de POO aplicados](#conceptos-de-poo-aplicados)
4. [Estructura del proyecto](#estructura-del-proyecto)
5. [Descripción de las clases](#descripción-de-las-clases)
6. [Diagrama de clases](#diagrama-de-clases)
7. [Flujo de ejecución](#flujo-de-ejecución)
8. [Ejemplos de uso](#ejemplos-de-uso)
9. [Conclusiones](#conclusiones)

---

## 🎯 Introducción

Este proyecto implementa un sistema de pagos para una tienda online de cursos de programación. El sistema permite procesar pagos mediante diferentes métodos: **Tarjeta de crédito**, **PayPal** y **Bizum**, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

---

## 🎓 Objetivo de la práctica

Desarrollar un sistema de pagos que demuestre el uso de:
- **Herencia**: Clases hijas que heredan de una clase padre abstracta
- **Polimorfismo**: Diferentes comportamientos para el mismo método según el tipo de objeto
- **Abstracción**: Uso de clases y métodos abstractos para definir comportamientos generales
- **Encapsulación**: Protección de datos mediante modificadores de acceso

---

## 🧩 Conceptos de POO aplicados

### 1. **Abstracción**
La clase `MetodoPago` es abstracta y define el contrato que deben cumplir todos los métodos de pago mediante el método abstracto `procesarPago()`.

### 2. **Herencia**
Las clases `Tarjeta`, `Paypal` y `Bizum` extienden de `MetodoPago`, heredando su estructura y obligándolas a implementar el método `procesarPago()`.

### 3. **Polimorfismo**
El método `realizarPago(MetodoPago metodo)` acepta cualquier tipo de método de pago, ejecutando la implementación específica de cada clase hija.

### 4. **Encapsulación**
Los atributos son privados y se accede a ellos mediante métodos públicos cuando es necesario (getters/setters en `Bizum`).

---

## 📁 Estructura del proyecto