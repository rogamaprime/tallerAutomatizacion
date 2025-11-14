# language:es
# encoding :UTF-8
#Se crean los escenarios de prueba
Característica: como usuario quiero validar el login en la pagina orange

Antecedentes:
  Dado que el usuario ingrese a la pagina de orange


@login
  Esquema del escenario: Validar Login exitoso.
    Cuando ingrese las credenciales con los datos correctos
    |Usuario|Contrasena|
    |<Usuario>|<Contrasena>|
 Entonces Se visualizara el nombre del usuario con la foto
  Ejemplos:
    | Usuario | Contrasena |
    | Admin | admin123 |
@LoginError
  Esquema del escenario: Validar excepciones del login
    Cuando ingrese las credenciales con los datos incorrectos
      |Usuario|Contrasena|
      |<Usuario>|<Contrasena>|
  Entonces Se debe visualizar el mensaje de error
  Ejemplos:
    | Usuario | Contrasena |
    | Admin | admin |

