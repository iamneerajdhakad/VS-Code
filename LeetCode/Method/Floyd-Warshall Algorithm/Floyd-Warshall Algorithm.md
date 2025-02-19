### 📌 **When to Use the Floyd-Warshall Algorithm?**  
**Floyd-Warshall Algorithm** is used to find **shortest paths** between all pairs of nodes in a **weighted graph** (including negative weights, but no negative weight cycles). It is commonly applied in:

1. **Finding the shortest paths between all pairs of nodes in a graph.**
2. **Calculating all pairs shortest path in dense graphs.**
3. **Handling negative edge weights efficiently, as long as no negative weight cycles exist.**
4. **Solving transitive closure problems, such as reachability between nodes.**
5. **Analyzing graph connectivity and distance properties in weighted graphs.**

---

### 🔥 **Optimization Strategy**  
- **The Floyd-Warshall Algorithm works by iteratively relaxing all pairs of nodes through each intermediate node.**
- **It is ideal for graphs where you need to compute shortest paths between all pairs, especially in dense graphs.**
- **It has a time complexity of O(V³), where V is the number of vertices, making it less efficient for large graphs.**
- **Avoid it for sparse graphs with many nodes and edges—other algorithms like Dijkstra’s may be more efficient.**

---

## 🟢 **7 Easy Problems (Floyd-Warshall Algorithm)**
1. **All Pairs Shortest Path Using Floyd-Warshall Algorithm**
2. **Finding the Shortest Path Between All Pairs in a Graph**
3. **Transitive Closure of a Graph Using Floyd-Warshall**
4. **Shortest Path Between All Pairs of Nodes in an Undirected Graph**
5. **Shortest Path Calculation for Small Graphs Using Floyd-Warshall**
6. **Detecting Negative Weight Cycles in a Graph Using Floyd-Warshall**
7. **Calculate Reachability Between Nodes in a Graph (Transitive Closure)**

---

## 🟡 **5 Medium Problems (Floyd-Warshall Algorithm)**
1. **Shortest Path Between All Pairs with Negative Weights (But No Negative Cycles)**
2. **Find the Diameter of a Graph Using Floyd-Warshall**
3. **All Pairs Shortest Path in a Weighted Directed Graph**
4. **Reachability Matrix of a Directed Graph Using Floyd-Warshall**
5. **Detecting Strongly Connected Components Using Floyd-Warshall**

---

## 🔴 **3 Hard Problems (Floyd-Warshall Algorithm)**
1. **Floyd-Warshall Algorithm with Multiple Edge Updates**
2. **Computing the Shortest Path in a Dynamic Graph Using Floyd-Warshall**
3. **Optimizing Floyd-Warshall for Very Large Dense Graphs**

---

**Floyd-Warshall is ideal for solving shortest path problems when you need the distance between all pairs of nodes, especially in dense graphs with negative edge weights.** 🚀 Let me know if you need explanations!