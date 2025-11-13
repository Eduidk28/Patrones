Taller de Patrones de Diseño Grupo 5

Bienvenido a nuestro repositorio del Taller de Patrones de Diseño.
Aquí aplicamos distintos patrones a un sistema de una tienda que maneja tarjetas de crédito y envía notificaciones a los clientes.
La idea es mostrar cómo estos patrones ayudan a organizar mejor el código y hacer el sistema más flexible.

Patrones que usamos
Factory Method

Lo usamos para crear los diferentes tipos de tarjetas: Básica, Premium y VIP.
Así la tienda puede seguir agregando más tipos sin tener que cambiar el código principal, solo creando nuevas clases cuando sean necesarias.

Decorator

Este patrón nos permite añadir nuevos mecanismos de notificación sin modificar la estructura base.
El sistema siempre manda SMS y correo, pero el cliente puede activar WhatsApp, Telegram, Signal, Wire, etc.
Cada nuevo canal es un decorador que se suma al flujo de envío.

Facade

La tienda tiene varios canales de atención (Web, móvil, telefónico) y cada uno ofrece solo ciertas operaciones.
El patrón Facade lo usamos para crear una interfaz sencilla que permita al cliente usar los servicios sin saber cómo funciona cada subsistema.
Básicamente, es como un “panel único” que es fácil de usar aunque por dentro haya un montón de cosas.