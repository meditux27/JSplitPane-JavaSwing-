# JSplitPane - JavaSwing

<img title="" src="https://programchi.ir/wp-content/uploads/2018/05/JSplitPane-min.png" alt="" width="429" data-align="center">

#### JSplitPane es una clase proporcionada por la biblioteca estándar de Java Swing

#### Se utiliza para dividir una ventana o panel en dos o más áreas redimensionables, generalmente con una barra divisoria que el usuario puede arrastrar para ajustar el tamaño de cada área. Esto es útil en aplicaciones de GUI cuando se necesita una división vertical u horizontal para mostrar contenido relacionado en dos o más paneles.

---

:book:  **Las características más importantes de un `JSplitPane` en Swing son las siguientes:**

1. **División de paneles**: `JSplitPane` permite dividir un contenedor en dos o más paneles, generalmente dos. Esto es útil para mostrar contenido relacionado en diferentes áreas de una ventana.

2. **Barra divisoria ajustable**: Proporciona una barra divisoria que el usuario puede arrastrar para ajustar el tamaño de los paneles. Esto permite a los usuarios personalizar la distribución del espacio según sus necesidades.

3. **Orientación configurable**: Puede configurarse para dividir los paneles horizontal o verticalmente según las necesidades de la interfaz de usuario. Esto se logra mediante el uso de `JSplitPane.HORIZONTAL_SPLIT` o `JSplitPane.VERTICAL_SPLIT`.

4. **Componentes secundarios personalizables**: Los componentes secundarios colocados en cada lado del `JSplitPane` pueden ser cualquier componente de Swing, como paneles, etiquetas, tablas, etc. Esto proporciona flexibilidad en la creación de interfaces de usuario.

5. **Colapsar y expandir paneles**: Los paneles pueden colapsarse o expandirse por completo con un solo clic, lo que permite a los usuarios ocultar temporalmente una sección de la interfaz de usuario.

6. **Restricciones de tamaño mínimo y máximo**: Puede establecer restricciones en el tamaño mínimo y máximo de los paneles, lo que ayuda a mantener una interfaz de usuario funcional y evita que los paneles se reduzcan o amplíen demasiado.

7. **Personalización de la apariencia**: Es posible personalizar la apariencia de la barra divisoria, como cambiar su color, estilo y tamaño, para que se adapte al diseño general de la interfaz de usuario.

8. **Eventos de cambio de división**: `JSplitPane` proporciona eventos que se pueden escuchar para realizar acciones cuando el usuario modifica la ubicación de la barra divisoria.

9. **Fácil manipulación programática**: Los paneles dentro del `JSplitPane` se pueden cambiar en tiempo de ejecución, lo que permite la reorganización de la interfaz de usuario según las necesidades de la aplicación.

---

:clipboard: **Pasos para implementar JTabbedPane**

1. **Importa las clases necesarias**:
   Asegúrate de importar las clases necesarias de la biblioteca de Swing. Agrega las siguientes importaciones en tu archivo Java:
   
   ```java
   import javax.swing.*;
   ```

2. **Crea componentes secundarios**:
   Define y crea los componentes secundarios (por ejemplo, paneles) que deseas colocar en los lados del `JSplitPane`. Estos componentes secundarios serán los paneles que se dividen.
   
   ```java
   JPanel leftPanel = new JPanel(); JPanel rightPanel = new JPanel();
   ```

3. **Crea el `JSplitPane`**:
   Crea una instancia de `JSplitPane` pasando los componentes secundarios que deseas dividir y la orientación de la división (horizontal o vertical). Por ejemplo:
   
   ```java
   JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
   ```
   
   Puedes personalizar la orientación cambiando `JSplitPane.HORIZONTAL_SPLIT` a `JSplitPane.VERTICAL_SPLIT` si deseas una división vertical.

4. **Opcional: Configura restricciones de tamaño mínimo y máximo**:
   Si deseas limitar el tamaño mínimo o máximo de los paneles, puedes hacerlo mediante los métodos `setDividerSize()`, `setDividerLocation()`, `setMinimumSize()`, y `setMaximumSize()` del `JSplitPane`.

5. **Agrega el `JSplitPane` al contenedor principal**:
   Agrega el `JSplitPane` al contenedor principal de tu ventana, como un `JFrame` o un `JPanel`. 
   
   ```java
   JFrame frame = new JFrame("SplitPane Example"); 
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   frame.setSize(400, 300); frame.add(splitPane); 
   // Agrega el JSplitPane al JFrame frame.setVisible(true);
   ```

6. **Opcional: Agrega manejo de eventos**:
   Puedes agregar oyentes de eventos al `JSplitPane` para realizar acciones específicas cuando el usuario ajusta la barra divisoria. Por ejemplo, puedes escuchar el evento `PropertyChangeEvent` para detectar cambios en la ubicación de la barra divisoria.

:coffee: [Estructura basica](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/TabbedPaneExample.java)

---

:octocat: **La clase  JSplitPane en Java Swing proporciona varios métodos que son comúnmente utilizados para personalizar y gestionar un JSplitPane.**





> :beginner: **setLeftComponent(Component) y setRightComponent(Component)**

- Descripción

 Este método se utilizan para establecer los componentes secundarios que se mostrarán en el lado izquierdo y derecho (o superior e inferior en caso de una división vertical) del `JSplitPane`, respectivamente.

- Sintaxis

```java
splitPane.setLeftComponent(newLeftComponent);
splitPane.setRightComponent(Righttexfield);
```

- Nota

La función de estos métodos es dividir el espacio dentro del `JSplitPane` entre los dos componentes secundarios que se establecen. Un componente se mostrará en un lado y el otro componente en el otro lado de la barra divisoria.

`setLeftComponent(Component)` y `setRightComponent(Component)`

Para entender mejor el contexto del uso se requiere ver un panorama completo  desde el momento de  la creación de los paneles, el split y la asignación de un componente a un lado de la división

//Creación de paneles

`JPanel leftPanel = new JPanel(); `

`JPanel rightPanel = new JPanel(); `



//Creación de la división y asignación de los paneles

`JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);`



 // Creación de un componente

`newLeftComponent = new JButton("Nuevo Componente Izquierdo");`


//Asignación del componente a un lado en especifico 

` splitPane.setLeftComponent(newLeftComponent);`



- Ejemplo:coffee:

[ addTab]( https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/AddTab_example.java)

---

> :beginner: **setOrientation(int)**

- Descripción

Este método se utiliza para insertar una nueva pestaña en una posición específica dentro de un `JTabbedPane`. A diferencia del método `addTab`, que agrega pestañas al final de la lista de pestañas, `insertTab` te permite especificar ordenadamente la posición en la que deseas insertar la pestaña.

- Sintaxis

```java

```

- Nota

Para la compresión del metodo es necesario dividirlo y analizar cada parámetro 

`tabbedPane.insertTab("title",icon,component, "tip", index);`

1. `title`: Es una cadena de texto que especifica el título de la nueva pestaña.

2. `icon`: Es un objeto `Icon` que representa un ícono que se mostrará en la pestaña. Puede ser `null` si no deseas mostrar un ícono.

3. `component`: Es un objeto `Component` que representa el contenido que se asociará con esta pestaña.

4. `tip`: Es una cadena de texto que especifica el texto de información sobre herramientas (tooltip) que se mostrará cuando el usuario pase el puntero del ratón sobre la pestaña. Puede ser `null` si no deseas proporcionar un tooltip.

5. `index`: Es un entero que especifica la posición en la que deseas insertar la nueva pestaña. Las posiciones se cuentan desde 0 para la primera pestaña y aumentan a medida que se agregan más pestañas.
- Ejemplo:coffee:

[insertTab](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/InsertTab_example.java)

---

> :beginner: **setDividerLocation(double)**

- Descripción

Este método se utiliza para eliminar una pestaña específica de un `JTabbedPane`. El parámetro `0` especifica la posición de la pestaña que deseas eliminar, y las posiciones comienzan en 0 para la primera pestaña y aumenta dependiendo de la posición a la que se desea eliminar 

- Sintaxis

```java

```

- Nota

Se debe tener en cuenta su estructura basica, el cual explicara su funcionamiento

`void removeTabAt(int index)`

- `index`: Un entero que especifica la posición de la pestaña que deseas eliminar.

Este método permite la eliminación de pestañas de forma dinámica durante la ejecución de la aplicación, lo que puede ser útil cuando se necesita agregar o quitar pestañas en respuesta a la interacción del usuario o a cambios en el estado de la aplicación.

- Ejemplo:coffee:

[removeTabAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/RemoveTabAtExample.java)

---

> :beginner: **setDividerSize(int)**

- Descripción

Puedes utilizar este método para determinar cuántas pestañas hay en un JTabbedPane en un momento dado. Esto es útil si necesitas realizar operaciones específicas basadas en la cantidad de pestañas

- Sintaxis

```java

```

- Nota

Este método no toma ningún argumento y devuelve un valor entero que representa la cantidad de pestañas en el `JTabbedPane`.

Para ver el funcionamiento de este metodo es necesario ingresar el resultado del metodo en una variable de tipo estero

//Se crea el componente tabbedPane 

`JTabbedPane tabbedPane = new JTabbedPane();`

//Se agregan los componentes previamente creados

`JPanel panel1 = new JPanel();`
 `panel1.add(new JLabel("Contenido de la pestaña 1"));`

`tabbedPane.addTab("Pestaña 1", panel1);`

//Se obtiene el numero de pestañas con el metodo 

`int numTabs = tabbedPane.getTabCount();`

- Ejemplo:coffee:

[getTabCount](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetTabCount_example.java)

---

> :beginner: **setResizeWeight(double)**

- Descripción

 Este método permite guardar los componentes o caractericas de una pestaña en especifico

- Sintaxis

```java

```

- Nota

Para poder utilizar este metodo es necesario previamente realizar la creacion de las pestañas (paneles) posteriormente adicionarlas con el metodo .addTab.

Con lo dicho anteriormente se puede implementar el metodo

`Component componente = tabbedPane.getComponentAt(index);`

Donde `index` es la posición de la pestaña cuyo componente deseas obtener. Ten en cuenta que esta posición comienza en 0 para la primera pestaña y aumenta a medida que se agregan más pestañas.

[getComponentAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetComponentAt_example.java)

---

> :beginner: **setOneTouchExpandable(boolean)**

- Descripción

 Este método se utiliza para obtener el título de una pestaña específica en un componente `JTabbedPane`

- Sintaxis

```java

```

- Nota

`tabbedPane.addTab("Tab 1", new JPanel());`
`tabbedPane.addTab("Tab 2", new JPanel());`
`tabbedPane.addTab("Tab 3", new JPanel());`

En este ejemplo, creamos un `JTabbedPane` y agregamos tres pestañas con títulos "Tab 1", "Tab 2" y "Tab 3". Luego, utilizamos `getTitleAt(0)` para obtener el título de la primera pestaña y lo mostramos en la consola.

- Ejemplo:coffee:

[getTitleAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetTitleAt_example.java)

---

> :beginner: **setContinuousLayout(boolean)**

- Descripción

Este método permite establecer que pestaña se presentara al ejecutar el programa en primer lugar

- Sintaxis

```java

```

- Nota

Este método es útil cuando deseas cambiar programáticamente la pestaña activa en un `JTabbedPane`, por ejemplo, en respuesta a eventos o acciones del usuario.

Por lo cual se debe tener en cuenta su estructura basica

`.setSelectedIndex(int index)`

El índex representa la posición de la pestaña que deseas seleccionar, comenzando desde 0 para la primera pestaña, 1 para la segunda y así sucesivamente

- Ejemplo:coffee:

[setSelectedIndex](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetSelectedIndex_example.java)

---

> :beginner: **setDividerLocation(int)**

- Descripción

se utiliza para obtener el índice de la pestaña actualmente seleccionada en el componente `JTabbedPane`. El índice representa la posición de la pestaña seleccionada, comenzando desde 0 para la primera pestaña, 1 para la segunda, y así sucesivamente.

- Sintaxis

```java

```

- Nota

`int variable=tabbedPane.getSelectedIndex()`

Debe tener en cuenta que el resultado del metodo es un dato tipo entero, por lo cual se debe manipular teniendo en cuenta esto para representarlos al momento de imprimir o manipular.

Este método es útil cuando deseas conocer la pestaña que está actualmente seleccionada en un `JTabbedPane`, por ejemplo, para realizar acciones basadas en la pestaña activa en respuesta a eventos del usuario.

- Ejemplo:coffee:

[getSelectedIndex](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetSelectedIndex_example.java)

---

> :beginner: **setTopComponent(Component) y setBottomComponent(Component)**

- Descripción

e utiliza para establecer la política de diseño de las pestañas en un `JTabbedPane`. La política de diseño determina cómo se manejarán las pestañas cuando el espacio en el `JTabbedPane` es limitado.

- Sintaxis

```java
t
```

- Nota

El parámetro `policy` es un entero que puede tomar uno de los siguientes valores:

1. `JTabbedPane.WRAP_TAB_LAYOUT`: Este es el valor predeterminado. En este modo, las pestañas se envuelven y se muestran en varias filas si no caben en el espacio disponible. Esto permite que todas las pestañas sean visibles, pero puede hacer que el `JTabbedPane` ocupe más espacio vertical.

2. `JTabbedPane.SCROLL_TAB_LAYOUT`: En este modo, se utiliza un botón de desplazamiento para permitir al usuario desplazarse a través de las pestañas si no caben en el espacio disponible. Esto ahorra espacio vertical, pero puede requerir que el usuario haga clic en el botón de desplazamiento para acceder a pestañas fuera de la vista.
- Ejemplo:coffee:

[WRAP_TAB_LAYOUT](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabLayoutPolicy_WRAP_TAB_LAYOUT_example.java)

[SCROLL_TAB_LAYOUT](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabLayoutPolicy_SCROLL_TAB_LAYOUT_example.java)

---

> :beginner: **getDividerLocation()**

- Descripción

se utiliza para establecer la ubicación de las pestañas en el componente `JTabbedPane`.

- Sintaxis

```java

```

- Nota

`setTabPlacement(int tabPlacement)` 

La ubicación de las pestañas se refiere a dónde se mostrarán las pestañas en relación con el área de contenido de `JTabbedPane`.

El parámetro `tabPlacement` es un valor entero que puede tomar uno de los siguientes valores predefinidos:

1. `JTabbedPane.TOP`: Este es el valor predeterminado. Coloca las pestañas en la parte superior del `JTabbedPane`, y el contenido se muestra debajo de las pestañas.

2. `JTabbedPane.BOTTOM`: Coloca las pestañas en la parte inferior del `JTabbedPane`, y el contenido se muestra arriba de las pestañas.

3. `JTabbedPane.LEFT`: Coloca las pestañas en el lado izquierdo del `JTabbedPane`, y el contenido se muestra a la derecha de las pestañas.

4. `JTabbedPane.RIGHT`: Coloca las pestañas en el lado derecho del `JTabbedPane`, y el contenido se muestra a la izquierda de las pestañas.
- Ejemplo:coffee:

[setTabPlacement](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabPlacement_example.java)

[setTabPlacement_test](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabPlacement_test.java)

---

> :beginner: **setMinimumSize(Dimension) y setMaximumSize(Dimension)**

- Descripción

 Este método se utiliza para establecer un ícono en una pestaña específica de un `JTabbedPane`. El ícono se mostrará junto al título de la pestaña y proporciona una representación visual adicional para la pestaña.

- Sintaxis

```java

```

- Nota

En el método `setIconAt(int tabIndex, Icon icon)`

El primer argumento, `tabIndex`, es el índice de la pestaña a la que deseas asignar un ícono, y el segundo argumento, `icon`, es el objeto `Icon` que representa el ícono que se mostrará en esa pestaña.

- Ejemplo:coffee:

[setIconAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetIconAt_example.java)

---

> :beginner: **resetToPreferredSizes()**

- Descripción

se utiliza para habilitar o deshabilitar una pestaña específica en un `JTabbedPane`.

- Sintaxis

```java

```

- Nota

`setEnabledAt(int tabIndex, boolean enabled)`

Este método permite controlar la capacidad de interactuar con una pestaña, lo que puede ser útil en situaciones donde deseas habilitar o deshabilitar el acceso a ciertas partes de tu aplicación según el contexto.

El primer argumento, `tabIndex`, es el índice de la pestaña a la que deseas habilitar o deshabilitar, y el segundo argumento, `enabled`, es un valor booleano que determina si la pestaña estará habilitada (`true`) o deshabilitada (`false`).

- Ejemplo:coffee:

[setEnabledAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetEnabledAt_example.java)

[setEnabledAt_test](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetEnabledAt_test.java)

---

> :beginner: **setLastDividerLocation(int)**

- Descripción

 Este método se utiliza para establecer un texto de información sobre herramientas (tooltip) para una pestaña específica en un `JTabbedPane`. El tooltip es el texto que se muestra cuando el usuario pasa el cursor sobre una pestaña, proporcionando información adicional sobre el contenido de la pestaña.

- Sintaxis

```java

```

- Nota

`setToolTipTextAt(int tabIndex, String text)`

El primer argumento, `tabIndex`, es el índice de la pestaña a la que deseas asignar el tooltip, y el segundo argumento, `text`, es el texto que se mostrará como tooltip cuando el cursor se coloque sobre esa pestaña.

El uso de `setToolTipTextAt()` es útil para proporcionar información adicional o descripciones breves sobre el contenido de las pestañas en tu interfaz de usuario, lo que puede ayudar a los usuarios a comprender mejor el propósito de cada pestaña.

- Ejemplo:coffee:

[setToolTipTextAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetToolTipTextAt_example.java)
