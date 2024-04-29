### 1. The steps and explanations on how to execute each use case in your Spring Boot app.
- Running *SamyungApplication.java* in *src\main\java\org\example\samyung* path
- The result will show on the web page via port 8080.
- Link to open: http://localhost:8080/

### 2. An explanation on the design pattern.

**Facade Pattern**

- The Facade pattern provides a simplified interface to a complex subsystem of classes, making it easier to use. In the given code, the CreateSciencePlanController acts as a facade by providing a simplified interface (showCreateSciPlanForm method) to access the functionality related to creating a science plan. It hides the complexity of loading an HTML file and presenting it to the user behind a single method call. Clients interact with the facade (CreateSciencePlanController) without needing to know about the underlying implementation details. In summary, the code snippet exhibits the Facade design pattern by providing a simplified interface to a complex subsystem (loading and presenting HTML content) through the CreateSciencePlanController class.
