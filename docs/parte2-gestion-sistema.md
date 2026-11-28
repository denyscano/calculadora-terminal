# Parte 2. Gestión del sistema y protección de la información

*Requisitos SIR-04, SIR-05 y SIR-06.*

## 2.1 Directorios del sistema

![Raíz del sistema (ls -l /) y contenido de /home, /etc y /media.](../imgs/p2-01-raiz-sistema-ls-l.png)

**Figura 1.** Raíz del sistema (ls -l /) y contenido de /home, /etc y /media.

![Carpeta personal /home/roberto en el explorador de archivos.](../imgs/p2-02-carpeta-personal-home-roberto.png)

**Figura 2.** Carpeta personal /home/roberto en el explorador de archivos.

## 2.2 Búsqueda de información

![Búsqueda gráfica del archivo hostname en /etc.](../imgs/p2-03-busqueda-grafica-archivo-hostname.png)

**Figura 3.** Búsqueda gráfica del archivo hostname en /etc.

![Búsqueda en terminal con find, cat, grep y whereis.](../imgs/p2-04-busqueda-terminal-find-cat.png)

**Figura 4.** Búsqueda en terminal con find, cat, grep y whereis.

![find ocultando los errores de permisos con 2>/dev/null.](../imgs/p2-05-find-ocultando-errores-permisos.png)

**Figura 5.** find ocultando los errores de permisos con 2>/dev/null.

## 2.3 Sistemas de archivos

![Sistemas de archivos del equipo con lsblk -f y df -Th.](../imgs/p2-06-sistemas-archivos-equipo-lsblk.png)

**Figura 6.** Sistemas de archivos del equipo con lsblk -f y df -Th.

![sda1: partición BIOS Boot de 1 MB, sin sistema de archivos.](../imgs/p2-07-sda1-particion-bios-boot.png)

**Figura 7.** sda1: partición BIOS Boot de 1 MB, sin sistema de archivos.

![sda2: partición ext4 montada en la raíz (/).](../imgs/p2-08-sda2-particion-ext4-montada.png)

**Figura 8.** sda2: partición ext4 montada en la raíz (/).

## 2.4 Disco virtual y particiones

![Instantánea «Antes de la práctica de discos».](../imgs/p2-09-instantanea-antes-practica-discos.png)

**Figura 9.** Instantánea «Antes de la práctica de discos».

![Creación del disco Disco-Practicas.vdi de 2 GB.](../imgs/p2-10-creacion-disco-disco-practicas.png)

**Figura 10.** Creación del disco Disco-Practicas.vdi de 2 GB.

![Selector de discos: tamaño virtual frente a tamaño real.](../imgs/p2-11-selector-discos-tamano-virtual.png)

**Figura 11.** Selector de discos: tamaño virtual frente a tamaño real.

![Disco de prácticas conectado al controlador SATA.](../imgs/p2-12-disco-practicas-conectado-controlador.png)

**Figura 12.** Disco de prácticas conectado al controlador SATA.

![Ubuntu reconoce el nuevo disco sdb de 2 GB.](../imgs/p2-13-ubuntu-reconoce-nuevo-disco.png)

**Figura 13.** Ubuntu reconoce el nuevo disco sdb de 2 GB.

![Particiones sdb1 y sdb2 creadas con parted (tabla GPT).](../imgs/p2-14-particiones-sdb1-sdb2-creadas.png)

**Figura 14.** Particiones sdb1 y sdb2 creadas con parted (tabla GPT).

![Formateo: sdb1 en ext4 (DATOS) y sdb2 en FAT32 (COMPARTIDO).](../imgs/p2-15-formateo-sdb1-ext4-datos.png)

**Figura 15.** Formateo: sdb1 en ext4 (DATOS) y sdb2 en FAT32 (COMPARTIDO).

![Montaje de las particiones en /mnt/datos y /mnt/compartido.](../imgs/p2-16-montaje-particiones-mnt-datos.png)

**Figura 16.** Montaje de las particiones en /mnt/datos y /mnt/compartido.

![Particiones montadas y archivos de prueba en cada una.](../imgs/p2-17-particiones-montadas-archivos-prueba.png)

**Figura 17.** Particiones montadas y archivos de prueba en cada una.

![Partición DATOS (ext4) vista en la aplicación Discos.](../imgs/p2-18-particion-datos-ext4-vista.png)

**Figura 18.** Partición DATOS (ext4) vista en la aplicación Discos.

![Partición COMPARTIDO (FAT32) vista en la aplicación Discos.](../imgs/p2-19-particion-compartido-fat32-vista.png)

**Figura 19.** Partición COMPARTIDO (FAT32) vista en la aplicación Discos.

## 2.5 Copia de seguridad y restauración

![Creación de los datos de trabajo de prueba.](../imgs/p2-20-creacion-datos-trabajo-prueba.png)

**Figura 20.** Creación de los datos de trabajo de prueba.

![Comprobación de que el disco de copias está montado.](../imgs/p2-21-comprobacion-que-disco-copias.png)

**Figura 21.** Comprobación de que el disco de copias está montado.

![Copia de seguridad comprimida con tar y su contenido.](../imgs/p2-22-copia-seguridad-comprimida-tar.png)

**Figura 22.** Copia de seguridad comprimida con tar y su contenido.

![Simulación de pérdida: datos de trabajo borrados.](../imgs/p2-23-simulacion-perdida-datos-trabajo.png)

**Figura 23.** Simulación de pérdida: datos de trabajo borrados.

![Restauración de la copia: los archivos vuelven con su contenido.](../imgs/p2-24-restauracion-copia-archivos-vuelven.png)

**Figura 24.** Restauración de la copia: los archivos vuelven con su contenido.

## 2.6 Utilidad: Déjà Dup

![Instalación de Déjà Dup (incluye restic).](../imgs/p2-25-instalacion-deja-dup-incluye.png)

**Figura 25.** Instalación de Déjà Dup (incluye restic).

![Carpeta de destino para los respaldos de Déjà Dup.](../imgs/p2-26-carpeta-destino-respaldos-deja.png)

**Figura 26.** Carpeta de destino para los respaldos de Déjà Dup.

![Déjà Dup 50.1-2 instalado desde el repositorio oficial.](../imgs/p2-27-deja-dup-50-1.png)

**Figura 27.** Déjà Dup 50.1-2 instalado desde el repositorio oficial.

![Pantalla inicial de Déjà Dup.](../imgs/p2-28-pantalla-inicial-deja-dup.png)

**Figura 28.** Pantalla inicial de Déjà Dup.

![Configuración por defecto: ubicación en Google Drive.](../imgs/p2-29-configuracion-defecto-ubicacion-google.png)

**Figura 29.** Configuración por defecto: ubicación en Google Drive.

![Configuración final: carpeta local y carpeta ~/Proyectos.](../imgs/p2-30-configuracion-final-carpeta-local.png)

**Figura 30.** Configuración final: carpeta local y carpeta ~/Proyectos.

![Opción de proteger el respaldo con contraseña (desactivada).](../imgs/p2-31-opcion-proteger-respaldo-contrasena.png)

**Figura 31.** Opción de proteger el respaldo con contraseña (desactivada).

![Resumen de Déjà Dup tras el primer respaldo.](../imgs/p2-32-resumen-deja-dup-tras.png)

**Figura 32.** Resumen de Déjà Dup tras el primer respaldo.

![Repositorio de restic creado por Déjà Dup.](../imgs/p2-33-repositorio-restic-creado-deja.png)

**Figura 33.** Repositorio de restic creado por Déjà Dup.

![Archivo tareas.txt borrado para probar la restauración.](../imgs/p2-34-archivo-tareas-txt-borrado.png)

**Figura 34.** Archivo tareas.txt borrado para probar la restauración.

![Respaldo abierto como carpeta con «Examinar respaldos».](../imgs/p2-35-respaldo-abierto-como-carpeta.png)

**Figura 35.** Respaldo abierto como carpeta con «Examinar respaldos».

![tareas.txt recuperado con su contenido.](../imgs/p2-36-tareas-txt-recuperado-contenido.png)

**Figura 36.** tareas.txt recuperado con su contenido.

## 2.7 Automatización (fstab, script y cron)

El disco de copias se monta al arrancar (`fstab`) y `cron` ejecuta el script de copia cada día a las 14:00.

![Montaje permanente de las particiones en /etc/fstab.](../imgs/p2-37-montaje-permanente-particiones-etc.png)

**Figura 37.** Montaje permanente de las particiones en /etc/fstab.

![Segunda ejecución de los comandos, que duplicó líneas en fstab.](../imgs/p2-38-segunda-ejecucion-comandos-que.png)

**Figura 38.** Segunda ejecución de los comandos, que duplicó líneas en fstab.

![Montaje sin errores tras limpiar /etc/fstab.](../imgs/p2-39-montaje-sin-errores-tras.png)

**Figura 39.** Montaje sin errores tras limpiar /etc/fstab.

![Script de copia backup_proyectos.sh.](../imgs/p2-40-script-copia-backup-proyectos.png)

**Figura 40.** Script de copia backup_proyectos.sh.

![Prueba manual del script: nueva copia y registro en backup.log.](../imgs/p2-41-prueba-manual-script-nueva.png)

**Figura 41.** Prueba manual del script: nueva copia y registro en backup.log.

![Tarea de cron programada cada minuto (prueba).](../imgs/p2-42-tarea-cron-programada-cada.png)

**Figura 42.** Tarea de cron programada cada minuto (prueba).

![Instalación de la tabla de cron.](../imgs/p2-43-instalacion-tabla-cron.png)

**Figura 43.** Instalación de la tabla de cron.

![Copias creadas automáticamente cada minuto.](../imgs/p2-44-copias-creadas-automaticamente-cada.png)

**Figura 44.** Copias creadas automáticamente cada minuto.

![Rotación: solo se conservan las 7 copias más recientes.](../imgs/p2-45-rotacion-solo-se-conservan.png)

**Figura 45.** Rotación: solo se conservan las 7 copias más recientes.

![Programación definitiva: todos los días a las 14:00.](../imgs/p2-46-programacion-definitiva-todos-dias.png)

**Figura 46.** Programación definitiva: todos los días a las 14:00.

![Comprobación de la tarea programada.](../imgs/p2-47-comprobacion-tarea-programada.png)

**Figura 47.** Comprobación de la tarea programada.
