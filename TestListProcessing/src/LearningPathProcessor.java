import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningPathProcessor {
    public static void main(String[] args) {
        String learningPath = """
          Beginner Level:
                  1. Introduction to Go: Basics of Go programming language, installation, and setting up the development environment.
                  2. Variables and Data Types: Understanding different data types in Go, declaring and initializing variables, and basic operations.
                  3. Control Flow: Conditional statements (if-else, switch), loops (for, while), and error handling (try-catch).
                  4. Functions: Defining and calling functions, passing arguments, returning values, and understanding scope.
                  5. Arrays and Slices: Working with arrays and slices, accessing elements, modifying values, and performing common operations.
                  6. Structs and Pointers: Introduction to structs, creating and accessing struct fields, and understanding pointers in Go.
                  
                  Intermediate Level:
                  1. Packages and Imports: Organizing code into packages, importing and using external packages, and creating your own packages.
                  2. Error Handling: Advanced error handling techniques, using the "error" interface, and handling panics and recoveries.
                  3. Concurrency: Introduction to goroutines and channels, understanding concurrent programming, and synchronization techniques.
                  4. File I/O: Reading from and writing to files, handling file operations, and working with file streams.
                  5. Networking: Basics of networking in Go, creating TCP/UDP clients and servers, and working with HTTP requests and responses.
                  6. Testing and Debugging: Writing unit tests, using the testing package, debugging techniques, and profiling your Go code.
                  
                  Expert Level:
                  1. Advanced Data Structures: Implementing and working with advanced data structures like linked lists, trees, graphs, and hash tables.
                  2. Reflection and Metaprogramming: Understanding reflection in Go, using reflection to inspect and modify objects at runtime.
                  3. Advanced Concurrency: Advanced techniques for concurrent programming, using mutexes, condition variables, and atomic operations.
                  4. Performance Optimization: Profiling and optimizing Go code, identifying bottlenecks, and improving performance.
                  5. Web Development: Building web applications using Go, working with frameworks like Gin or Echo, and integrating with databases.
                  6. Deployment and Scalability: Deploying Go applications, containerization with Docker, and scaling applications using Kubernetes.
                  
                  Note: This learning path assumes prior programming knowledge and experience in another language. 
                  It is recommended to practice coding exercises and work on small projects to reinforce the concepts learned at each level.s
        """;

        // Process the learning path
        List<List<String>> processedLearningPath = processLearningPath(learningPath);

        // Print the processed learning path
        printLearningPath(processedLearningPath);
    }

    private static List<List<String>> processLearningPath(String input) {
        List<List<String>> result = new ArrayList<>();
        String[] levels = {"Beginner", "Intermediate", "Expert"};

        for (int i = 0; i < levels.length; i++) {
            String level = levels[i];
            Pattern pattern = Pattern.compile(level + " Level:(.*?)(?=" + (i == levels.length - 1 ? "$" : levels[i + 1] + " Level:") + ")", Pattern.DOTALL);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                List<String> concepts = new ArrayList<>();
                String conceptsText = matcher.group(1).trim();
                String[] conceptArray = conceptsText.split("\\n\\s*\\d+\\.\\s");

                for (String concept : conceptArray) {
                    concepts.add(concept.trim());
                }

                result.add(concepts);
            }
        }

        return result;
    }

    private static void printLearningPath(List<List<String>> learningPath) {

        String[] levels = {"Beginner", "Intermediate", "Expert"};

        for (int i = 0; i < learningPath.size(); i++) {
            System.out.println(levels[i] + " Level Concepts:");
            for (String concept : learningPath.get(i)) {
                System.out.println("- " + concept);
            }
            System.out.println();
        }
    }
}
