# 📘 README - ValidadorRegistroTest

## 🧩 Descripción

Este proyecto contiene una clase de pruebas unitarias (`ValidadorRegistroTest`) desarrollada con **JUnit 5** para validar el correcto funcionamiento de una clase llamada `ValidadorRegistro`.

El objetivo es comprobar distintos casos de validación típicos en un sistema de registro de usuarios, como nombre, contraseña, email y edad.

---

## 🛠️ Tecnologías utilizadas

* Java
* JUnit 5 (`org.junit.jupiter`)

---

## 📂 Estructura del proyecto

```
instituto/
│
├── ValidadorRegistro.java      // Clase principal (no incluida aquí)
└── ValidadorRegistroTest.java  // Clase de pruebas
```

---

## 🧪 Casos de prueba

### ✅ Reto 1: Nombre vacío

* **Entrada:** `""`
* **Esperado:** `false`
* **Descripción:** Verifica que no se acepten nombres vacíos.

---

### ✅ Reto 2: Contraseña válida (justa)

* **Entrada:** `"12345678"`
* **Esperado:** `true`
* **Descripción:** Comprueba que una contraseña con longitud mínima válida sea aceptada.

---

### ❌ Reto 3: Contraseña corta

* **Entrada:** `"Amdmin"`
* **Esperado:** `false`
* **Descripción:** Verifica que una contraseña demasiado corta sea rechazada.

---

### ❌ Reto 4: Email sin arroba

* **Entrada:** `"usuario.gmail.com"`
* **Esperado:** `false`
* **Descripción:** Comprueba que un email sin `@` sea inválido.

---

### ✅ Reto 5: Edad límite

* **Entrada:** `16`
* **Esperado:** `true`
* **Descripción:** Verifica que la edad mínima permitida sea aceptada.

---

## ▶️ Cómo ejecutar las pruebas

1. Asegúrate de tener JUnit 5 configurado en tu proyecto.
2. Ejecuta la clase `ValidadorRegistroTest` desde tu IDE (IntelliJ, Eclipse, VS Code) o mediante Maven/Gradle.
3. Revisa los resultados en el panel de tests.

---

## ⚠️ Notas

* Este archivo solo contiene pruebas; la implementación de `ValidadorRegistro` debe existir y cumplir las condiciones esperadas.
* Los mensajes en los `assert` ayudan a identificar errores en caso de fallo.

---

## ✍️ Autor

Proyecto de práctica para validaciones básicas en Java con testing unitario.

---

## Captura de pantalla

<img width="1817" height="872" alt="Captura de pantalla 2026-03-18 125559" src="https://github.com/user-attachments/assets/fb77fc70-d9f8-45f8-84b8-79734bb92655" />
