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
      | Joseph  Evans | usuario Prueba No borrar | Ma*12345678 | Ma*12345678 |

  @FiltroUsername
  Esquema del escenario: Filtrar por nombre de usuario
    Cuando ingresa a modulo admin para usar los filtros de consulta
    Entonces filtra por nombre de usuario "<nomUsuario>", y da clic en el botón buscar
    Y se debe visualizar el resultado
    Ejemplos:
      | nomUsuario |
      | Admin      |

  @FiltroUserRol
  #Esquema del
    Escenario: Filtrar por Rol de usuario
    Cuando ingresa a modulo admin para usar los filtros de consulta
    Entonces filtra por rol de usuario y da clic en el botón buscar
    Y se debe visualizar el resultado

  @FiltroNomEmpl
  Esquema del escenario: Filtrar por nombre de empleado
    Cuando ingresa a modulo admin para usar los filtros de consulta
    Entonces filtra por nombre empleado "<NomEmpl>", y da clic en el botón buscar
    Y se debe visualizar el resultado
    Ejemplos:
      | NomEmpl |
      | Unnati rajguru   |

  @FiltroUserStado
  #Esquema del
    Escenario: Filtrar por estado de usuario
    Cuando ingresa a modulo admin para usar los filtros de consulta
    Entonces filtra por estado de usuario y da clic en el botón buscar
    Y se debe visualizar el resultado

