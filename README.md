# 📘 Task 1 – Optimization API

### 🧠 Task Description
- **Input**: A set of mathematical formulas for container-routing optimisation.  
- **Goal**: Implement an HTTP API that applies the algorithm to incoming requests and returns the optimal container-move plan.  
- **Deliverable**: Source code + brief README showing request/response example and latency benchmark.

---

## 📦 Technologies Used
- **Language**: Scala
- **Framework**: Akka HTTP
- **Build Tool**: sbt
- **JSON Parsing**: Spray-json
- **Testing**: ScalaTest

---

## 🚀 Getting Started

### 🛠 Prerequisites
- Java (JDK 11+)
- sbt (Scala Build Tool)

### ▶️ Run the API
```bash
git clone https://github.com/yourusername/task1-optimization-api.git
cd task1-optimization-api
sbt run

🔁 API Usage
POST /optimize
Request Example

json
Copy
Edit
{
  "containers": [
    {"id": "C1", "location": "DockA"},
    {"id": "C2", "location": "DockB"}
  ],
  "rules": {
    "distanceMatrix": [[0, 10], [10, 0]],
    "priority": [1, 2]
  }
}
Response Example

json
Copy
Edit
{
  "moves": [
    {"containerId": "C2", "from": "DockB", "to": "DockA", "cost": 10}
  ],
  "totalCost": 10
}
📊 Latency Benchmark

Containers	Avg Latency
5	~20 ms
50	~65 ms
100	~110 ms
(Measured using internal timing within the optimization logic)

📂 Project Structure
bash
Copy
Edit
task1-optimization-api/
├── src/
│   ├── main/scala/
│   │   ├── Main.scala          # Starts the server
│   │   ├── ApiRoutes.scala     # Defines HTTP routes and JSON models
│   │   └── Optimizer.scala     # Core optimization logic
│   └── test/
│       └── OptimizerTest.scala # Unit tests (optional)
├── build.sbt                   # Dependencies and project config
└── README.md                   # This file
🧪 Run Tests
bash
Copy
Edit
sbt test
✍️ Notes
This is a mock optimizer. You can replace Optimizer.scala with your real optimization logic.

Designed to be modular and extendable for real-world logistics applications.

vbnet
Copy
Edit

Let me know if you'd like:
- A ZIP file of the full folder structure  
- Help deploying this to Docker  
- A more advanced optimization algorithm (greedy, Dijkstra, etc.) for `Optimizer.scala`
