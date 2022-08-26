# Reto8
Juan Diego Calderon Bermeo - 1000378849            
Jonathan David Ardila Gomez - 1014276851


Informe de refactorización

Refactorización de los retos 3, 5 y 7

En primer lugar, se revisaron nombres de variables cambiando los que no cumplían con los
parámetros de buenas prácticas y código limpio, también se arreglaron los nombres de las
constantes escribiéndolos en mayúscula sostenida, en el reto 3 identificamos dos constructores en
dos diferentes clases la clase automóvil y la clase vendedor los cuales no tenían ningún tipo de
funcionalidad y se decidió eliminarlos del código además de esto en el mismo reto se agregaron
getters and setters faltantes.

Por otro lado, en cada uno de los retos de identificaron variables que pudieran generar datos
ambiguos que no hubieran sido contempladas en retos anteriores para su correcto
funcionamiento, por ejemplo, en el reto 3 se agregaron en la clase Automóvil las siguientes
excepciones: ExceptionAnioFabricacion y ExceptionPrecio, en la clase Motor ExceptionCilindraje y
en la clase Vendedor exceptionValorTotalVendido. En el reto 5 se agregaron las excepciones:
ExceptionSaludNegativa y ExceptionNivelNegativo, en el reto 7 se agregaron las excepciones:
ExceptionVelocidadNegativo y ExceptionEspesorNegativo.

Por último re reviso que todos los retos funcionaran correctamente implementando todas las
correcciones de código para cumplir con los estándares de buenas prácticas.
