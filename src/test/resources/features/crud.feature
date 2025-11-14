# language:es
# encoding :UTF-8
#Se crean los escenarios de prueba del crud
Característica: Probar crud de usuarios en orange

Antecedentes:
  Dado que el usuario ingrese a la pagina de orange
  Cuando ingrese las credenciales con los datos correctos
    | Usuario | Contrasena |
    | Admin | admin123 |

@Crearusuario
  Esquema del escenario: Crear usuario exitoso.
    Y ingrese al modulo admin y de clic en el botón + Add
  Entonces se diligencian los campos "<NombreEmpleado>", "<nombreUsuario>", "<Contraseña>", "<ConfContraseña>"
    Ejemplos:
      | NombreEmpleado | nombreUsuario | Contraseña | ConfContraseña |
      | Prueba | pruebausuario | 12345 | 12345 |






