# Práctica 1 - Sistema de Pago para E-commerce

## Índice de contenido
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

## Introducción

La práctica nos pide implementar un sistema de pagos para un ecommerce, tendremos 3 métodos de pago: Bizum, PayPal y Tarjeta de Crédito
Los tres métodos de pago extienden de la clase “MetodoPago”, siendo esta la clase madre (y clase abstracta). Estos métodos aplican polimorfismo al método abstracto de la clase madre “procesarPago”.
Con PayPal deberemos de validar que la cuenta tiene los parámetros correctos (chequear que introdujo bien el correo) y debemos de comprobar de que el saldo que tiene la cuenta no es menor al importe del pago que queremos realizar.
Con Bizum, debemos de validar de que el número de teléfono ha sido introducido correctamente (9 números) y comprobar que el usuario introduce el pin correctamente.
Con Tarjeta, la validación debe ser que introduzcas el número de la tarjeta correctamente (16 números) y que hayas seleccionado un tipo de tarjeta que esté contemplado (Visa, Mastercard, Maestro).

Todo el proceso del pago se realizará en la clase “Tienda”, que es donde el usuario elige el método de pago, el importe a pagar, etc.


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
