# Errores encontrados y solucionados (pasos 1 y 2)

Durante los pasos 1 y 2 aparecieron 16 errores, todos resueltos. Solo uno impidió seguir trabajando: la virtualización desactivada en la BIOS (error 3).

| Nº | Error | Solución |
|---|---|---|
| 1 | Instalación desatendida marcada por defecto | Desmarcar «Proceed with Unattended Installation». |
| 2 | Disco virtual demasiado pequeño | Subirlo a 40 GB (disco dinámico). |
| 3 | La máquina no arranca (VT-x desactivado) | Activar Virtualization Technology (VTx) en la BIOS de HP. |
| 4 | Pantalla de la máquina muy pequeña | Ctrl derecha + F al instalar y después las Guest Additions. |
| 5 | Reloj de Ubuntu desfasado | Las Guest Additions sincronizan la hora. |
| 6 | El CD de las Guest Additions no aparece | Montarlo con `sudo mount /dev/sr0 /mnt/cdrom`. |
| 7 | El instalador parece colgado | Esperar y comprobar con `VBoxControl --version`. |
| 8 | Caracteres extraños al pegar | `echo "set enable-bracketed-paste off" >> ~/.inputrc`. |
| 9 | Archivo con una ~ al final | Borrarlo y crearlo de nuevo. |
| 10 | «Permiso denegado» al usar find | Ocultar los errores con `2>/dev/null`. |
| 11 | Disco de prácticas con valores incorrectos | Cambiar a 2 GB y `Disco-Practicas.vdi`. |
| 12 | «~mkdir: orden no encontrada» | `bind 'set enable-bracketed-paste off'` y repetir. |
| 13 | fstab con líneas duplicadas | Quitar los duplicados con `awk '!visto[$0]++'`. |
| 14 | Déjà Dup no aparece en el buscador | Abrirlo con `deja-dup &`. |
| 15 | La restauración no recupera el archivo | Copiar el archivo desde el respaldo a su carpeta. |
| 16 | crontab -l no muestra la tarea | Usar `crontab -l \| grep -v '^#'`. |

## Paso 1: máquina virtual

### Error 1. Instalación desatendida marcada por defecto

**Problema:** El asistente iba a instalar Ubuntu solo, sin mostrar los pasos. **Solución:** Desmarcar «Proceed with Unattended Installation».

![Casilla marcada por defecto.](../imgs/err01-error.png)

*Casilla marcada por defecto.*

![Casilla desmarcada: instalación manual.](../imgs/err01-corregido.png)

*Casilla desmarcada: instalación manual.*

### Error 2. Disco virtual demasiado pequeño

**Problema:** Proponía 25 GB, el mínimo de Ubuntu. **Solución:** Subirlo a 40 GB (disco dinámico).

![Disco de 25 GB propuesto.](../imgs/err02-error.png)

*Disco de 25 GB propuesto.*

![Disco de 40 GB, 4 GB de RAM y 2 CPU.](../imgs/err02-corregido.png)

*Disco de 40 GB, 4 GB de RAM y 2 CPU.*

### Error 3. La máquina no arranca (VT-x desactivado)

**Problema:** Error «VT-x is disabled in the BIOS»: la virtualización estaba apagada. **Solución:** Activar Virtualization Technology (VTx) en la BIOS de HP.

![Error de VirtualBox al arrancar.](../imgs/err03-error.png)

*Error de VirtualBox al arrancar.*

![Opción VTx en la BIOS del portátil.](../imgs/err03-bios.jpg)

*Opción VTx en la BIOS del portátil.*

![La máquina ya arranca hasta GRUB.](../imgs/err03-corregido.png)

*La máquina ya arranca hasta GRUB.*

### Error 4. Pantalla de la máquina muy pequeña

**Problema:** Faltaban las Guest Additions. **Solución:** Ctrl derecha + F al instalar y después las Guest Additions.

![Ubuntu ya ocupa toda la ventana.](../imgs/err04-corregido.png)

*Ubuntu ya ocupa toda la ventana.*

### Error 5. Reloj de Ubuntu desfasado

**Problema:** Ubuntu y Windows marcaban horas distintas. **Solución:** Las Guest Additions sincronizan la hora.

![11:20 en Ubuntu y 12:02 en Windows.](../imgs/err05-error.png)

*11:20 en Ubuntu y 12:02 en Windows.*

![Las dos marcan la misma hora.](../imgs/err05-corregido.png)

*Las dos marcan la misma hora.*

### Error 6. El CD de las Guest Additions no aparece

**Problema:** Ubuntu no montó el CD solo. **Solución:** Montarlo con `sudo mount /dev/sr0 /mnt/cdrom`.

![El CD no está en /media.](../imgs/err06-error.png)

*El CD no está en /media.*

![CD montado a mano en /mnt/cdrom.](../imgs/err06-corregido.png)

*CD montado a mano en /mnt/cdrom.*

### Error 7. El instalador parece colgado

**Problema:** Estaba compilando los módulos sin mostrar progreso. **Solución:** Esperar y comprobar con `VBoxControl --version`.

![Instalador sin progreso.](../imgs/err07-error.png)

*Instalador sin progreso.*

![Guest Additions 7.2.22 instaladas y activas.](../imgs/err07-corregido.png)

*Guest Additions 7.2.22 instaladas y activas.*

### Error 8. Caracteres extraños al pegar

**Problema:** El modo «bracketed paste» añadía `^[[200~` al texto pegado. **Solución:** `echo "set enable-bracketed-paste off" >> ~/.inputrc`.

![Códigos al pegar en la terminal.](../imgs/err08-error.png)

*Códigos al pegar en la terminal.*

![Comandos pegados sin códigos.](../imgs/err08-corregido.png)

*Comandos pegados sin códigos.*

### Error 9. Archivo con una ~ al final

**Problema:** El mismo fallo al pegar creó `desde_ubuntu.txt~`. **Solución:** Borrarlo y crearlo de nuevo.

![Archivo con ~ visto en Windows.](../imgs/err09-error.png)

*Archivo con ~ visto en Windows.*

![Archivo con el nombre correcto.](../imgs/err09-corregido.png)

*Archivo con el nombre correcto.*

## Paso 2: gestión del sistema

### Error 10. «Permiso denegado» al usar find

**Problema:** Un usuario normal no entra en carpetas protegidas. **Solución:** Ocultar los errores con `2>/dev/null`.

![Resultados mezclados con errores.](../imgs/err10-error.png)

*Resultados mezclados con errores.*

![Solo los resultados.](../imgs/err10-corregido.png)

*Solo los resultados.*

### Error 11. Disco de prácticas con valores incorrectos

**Problema:** Proponía 25 GB y un nombre genérico. **Solución:** Cambiar a 2 GB y `Disco-Practicas.vdi`.

![Valores por defecto del disco.](../imgs/err11-error.png)

*Valores por defecto del disco.*

![Disco de 2 GB con su nombre.](../imgs/err11-corregido.png)

*Disco de 2 GB con su nombre.*

### Error 12. «~mkdir: orden no encontrada»

**Problema:** La ~ del pegado se coló delante del comando. **Solución:** `bind 'set enable-bracketed-paste off'` y repetir.

![La ~ delante de mkdir.](../imgs/err12-error.png)

*La ~ delante de mkdir.*

![mkdir y la copia funcionan.](../imgs/err12-corregido.png)

*mkdir y la copia funcionan.*

### Error 13. fstab con líneas duplicadas

**Problema:** Repetir los `echo ... | tee -a` duplicó líneas. **Solución:** Quitar los duplicados con `awk '!visto[$0]++'`.

![Avisos de «ya está montado».](../imgs/err13-error.png)

*Avisos de «ya está montado».*

![Montaje sin errores.](../imgs/err13-corregido.png)

*Montaje sin errores.*

### Error 14. Déjà Dup no aparece en el buscador

**Problema:** El menú no se había actualizado. **Solución:** Abrirlo con `deja-dup &`.

![La búsqueda no lo encuentra.](../imgs/err14-error.png)

*La búsqueda no lo encuentra.*

![Déjà Dup abierto.](../imgs/err14-corregido.png)

*Déjà Dup abierto.*

### Error 15. La restauración no recupera el archivo

**Problema:** «Examinar respaldos» solo abre el respaldo para leerlo. **Solución:** Copiar el archivo desde el respaldo a su carpeta.

![El archivo sigue sin existir.](../imgs/err15-error.png)

*El archivo sigue sin existir.*

![El respaldo abierto como carpeta.](../imgs/err15-respaldo.png)

*El respaldo abierto como carpeta.*

![Archivo recuperado.](../imgs/err15-corregido.png)

*Archivo recuperado.*

### Error 16. crontab -l no muestra la tarea

**Problema:** La última línea del archivo está en blanco. **Solución:** Usar `crontab -l | grep -v '^#'`.

![tail -1 devuelve la línea vacía.](../imgs/err16-error.png)

*tail -1 devuelve la línea vacía.*

![La tarea programada a las 14:00.](../imgs/err16-corregido.png)

*La tarea programada a las 14:00.*

## Avisos que no son errores

| Mensaje | Significado |
|---|---|
| Actualizaciones paulatinas (phasing) | Ubuntu las publica poco a poco; llegan solas |
| Paquetes ya no necesarios | Restos del kernel anterior (`sudo apt autoremove`) |
| Sistema detectado como Ubuntu 25.04 | VirtualBox aún no conoce la 26.10 |
| MESA-EGL / ZINK al abrir Déjà Dup | La máquina no tiene aceleración 3D; funciona igual |
| Discos muestra 43 GB en vez de 40 | GB (1000³) frente a GiB (1024³) |

![Mensajes de phasing tras actualizar.](../imgs/aviso-phasing.png)

*Mensajes de phasing tras actualizar.*

![Avisos gráficos de Déjà Dup.](../imgs/aviso-mesa.png)

*Avisos gráficos de Déjà Dup.*

## Lecciones aprendidas

1. Revisar los valores por defecto de los asistentes.
2. Comprobar que la virtualización está activada antes de empezar.
3. Revisar la línea antes de pulsar Enter al pegar un comando.
4. Comprobar con un comando en vez de suponer.
5. Copiar un archivo del sistema antes de modificarlo.
6. Hacer una instantánea antes de cada cambio importante.
