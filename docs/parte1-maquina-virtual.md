# Parte 1. Planificación e instalación de la máquina virtual

*Requisitos SIR-01, SIR-02 y SIR-03.*

## 1.1 Creación de la máquina virtual

Se asignan 4 GB de RAM y 2 CPU (la mitad del anfitrión: 8 GB y 4 núcleos) y un disco dinámico de 40 GB.

![Asistente de VirtualBox: nombre, ISO e instalación manual.](../imgs/p1-01-asistente-virtualbox-nombre-iso.png)

**Figura 1.** Asistente de VirtualBox: nombre, ISO e instalación manual.

![Hardware: 4096 MB de RAM, 2 CPU y disco dinámico de 40 GB.](../imgs/p1-02-hardware-4096-mb-ram.png)

**Figura 2.** Hardware: 4096 MB de RAM, 2 CPU y disco dinámico de 40 GB.

![Resumen de la configuración antes de crear la máquina.](../imgs/p1-03-resumen-configuracion-antes-crear.png)

**Figura 3.** Resumen de la configuración antes de crear la máquina.

![Pantalla: 128 MB de vídeo y controlador VMSVGA.](../imgs/p1-04-pantalla-128-mb-video.png)

**Figura 4.** Pantalla: 128 MB de vídeo y controlador VMSVGA.

## 1.2 Instalación de Ubuntu

![Menú GRUB del medio de instalación de Ubuntu.](../imgs/p1-05-menu-grub-medio-instalacion.png)

**Figura 5.** Menú GRUB del medio de instalación de Ubuntu.

![Elección del idioma en el instalador.](../imgs/p1-06-eleccion-idioma-instalador.png)

**Figura 6.** Elección del idioma en el instalador.

![Resumen de la instalación: disco borrado y sda2 en ext4 montada en /.](../imgs/p1-07-resumen-instalacion-disco-borrado.png)

**Figura 7.** Resumen de la instalación: disco borrado y sda2 en ext4 montada en /.

![Escritorio de Ubuntu 26.10 tras el primer arranque.](../imgs/p1-08-escritorio-ubuntu-26-10.png)

**Figura 8.** Escritorio de Ubuntu 26.10 tras el primer arranque.

## 1.3 Actualización del sistema

![Sistema actualizado con apt upgrade: ningún paquete pendiente.](../imgs/p1-09-sistema-actualizado-apt-upgrade.png)

**Figura 9.** Sistema actualizado con apt upgrade: ningún paquete pendiente.

## 1.4 Guest Additions e integración con el anfitrión

![Inserción del CD de las Guest Additions desde Dispositivos.](../imgs/p1-10-insercion-cd-guest-additions.png)

**Figura 10.** Inserción del CD de las Guest Additions desde Dispositivos.

![Ejecución del instalador de las Guest Additions 7.2.22.](../imgs/p1-11-ejecucion-instalador-guest-additions.png)

**Figura 11.** Ejecución del instalador de las Guest Additions 7.2.22.

![Guest Additions comprobadas: versión, servicio activo y módulo cargado.](../imgs/p1-12-guest-additions-comprobadas-version.png)

**Figura 12.** Guest Additions comprobadas: versión, servicio activo y módulo cargado.

![Portapapeles compartido en modo bidireccional.](../imgs/p1-13-portapapeles-compartido-modo-bidireccional.png)

**Figura 13.** Portapapeles compartido en modo bidireccional.

![Prueba del portapapeles: texto copiado en Windows y pegado en Ubuntu.](../imgs/p1-14-prueba-portapapeles-texto-copiado.png)

**Figura 14.** Prueba del portapapeles: texto copiado en Windows y pegado en Ubuntu.

![Carpeta Proyecto_Final en Windows con un archivo de prueba.](../imgs/p1-15-carpeta-proyecto-final-windows.png)

**Figura 15.** Carpeta Proyecto_Final en Windows con un archivo de prueba.

![Configuración de la carpeta compartida en VirtualBox (automontaje).](../imgs/p1-16-configuracion-carpeta-compartida-virtualbox.png)

**Figura 16.** Configuración de la carpeta compartida en VirtualBox (automontaje).

![La carpeta compartida se ve desde Ubuntu (usuario en el grupo vboxsf).](../imgs/p1-17-carpeta-compartida-se-ve.png)

**Figura 17.** La carpeta compartida se ve desde Ubuntu (usuario en el grupo vboxsf).

![Archivo creado desde Ubuntu en la carpeta compartida.](../imgs/p1-18-archivo-creado-desde-ubuntu.png)

**Figura 18.** Archivo creado desde Ubuntu en la carpeta compartida.

![El archivo creado desde Ubuntu aparece en Windows.](../imgs/p1-19-archivo-creado-desde-ubuntu.png)

**Figura 19.** El archivo creado desde Ubuntu aparece en Windows.

## 1.5 Instantánea y recuperación

![Nombre y descripción de la instantánea.](../imgs/p1-20-nombre-descripcion-instantanea.png)

**Figura 20.** Nombre y descripción de la instantánea.

![Instantánea «Sistema base limpio» creada.](../imgs/p1-21-instantanea-sistema-base-limpio.png)

**Figura 21.** Instantánea «Sistema base limpio» creada.

![Cambio de prueba: carpeta PRUEBA_ROTO creada y calculadora desinstalada.](../imgs/p1-22-cambio-prueba-carpeta-prueba.png)

**Figura 22.** Cambio de prueba: carpeta PRUEBA_ROTO creada y calculadora desinstalada.

![La calculadora ya no aparece en el menú.](../imgs/p1-23-calculadora-ya-no-aparece.png)

**Figura 23.** La calculadora ya no aparece en el menú.

![Selección de la instantánea para restaurarla.](../imgs/p1-24-seleccion-instantanea-restaurarla.png)

**Figura 24.** Selección de la instantánea para restaurarla.

![Confirmación de la restauración.](../imgs/p1-25-confirmacion-restauracion.png)

**Figura 25.** Confirmación de la restauración.

![Sistema restaurado: la carpeta ha desaparecido y la calculadora ha vuelto.](../imgs/p1-26-sistema-restaurado-carpeta-ha.png)

**Figura 26.** Sistema restaurado: la carpeta ha desaparecido y la calculadora ha vuelto.
