# language:es
# encoding :UTF-8
#Se crean los escenarios de prueba del crud
Característica: Probar crud de usuarios en orange

  Antecedentes:
    Dado que el usuario ingrese a la pagina de orange
    Cuando ingrese las credenciales con los datos correctos
      | Usuario | Contrasena |
      | Admin   | admin123   |

  @Crearusuario
  Esquema del escenario: Crear usuario exitoso.
    Y ingrese al modulo admin y de clic en el botón + Add
    Entonces se diligencian los campos "<Empleado>", "<Usuario>", "<Clave>", "<ConfClave>"
    Ejemplos:
      | Empleado      | Usuario                  | Clave       | ConfClave   |
      | Joseph  Evans | usuarioPrueba No borrar2 | Ma*12345678 | Ma*12345678 |

  @FiltroUsername
  Esquema del escenario: Filtrar por nombre de usuario
    Cuando ingresa a modulo admin para usar los filtros de consulta
    Y filtra por nombre de usuario "<Usuario>"
    Entonces debería ver resultados relacionados con "<Usuario>"

    Ejemplos:
      | Usuario                  |
      | usuarioPrueba No borrar2 |









