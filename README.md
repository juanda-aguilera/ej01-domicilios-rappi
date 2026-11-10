# Ejercicio 1 — Domicilios Rappi

Programación 1 · Universidad Libre · Docente: Andrés Castaño

## Cómo ejecutarlo

```bash
javac -d out src/*.java
java -cp out Main
```

## Qué hace

Calcula el precio de un domicilio para el cliente y la ganancia del repartidor a partir de una configuración (tarifa base, valor por km y recargo por lluvia). El administrador puede activar un recargo por lluvia.

## Qué se resolvió

- **Antes:** cada clase creaba su propia `ConfiguracionApp` con `new`. El recargo activado por el administrador quedaba en su copia y el cliente y el repartidor no lo veían (precio $6900 y ganancia $2400). Además, el archivo de configuración se leía tres veces.
- **Ahora:** `ConfiguracionApp` es un **Singleton** (constructor privado y `getInstance()`). Todas las clases comparten la misma configuración, el precio de 3 km es $8900, la ganancia del repartidor es $4400 y la configuración se lee una sola vez
