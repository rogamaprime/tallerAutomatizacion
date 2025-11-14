# language:es
# encoding :UTF-8
#Se crean los escenarios de prueba
Característica: como usuario quiero validar el login en la pagina orange
@login
  Esquema del escenario: Validar Login exitoso.
    Dado que el usuario ingrese a la pagina de orange
    Cuando ingrese las credenciales con los datos correctos
    |Usuario|Contrasena|
    |<Usuario>|<Contrasena>|
 Entonces Se visualizara el nombre del usuario con la foto
  Ejemplos:
    | Usuario | Contrasena |
    | Admin | admin123 |
