### 📌 **When to Use the Merge Sort Pattern?**  
**Merge Sort** is a **divide-and-conquer** sorting algorithm that divides the array into smaller sub-arrays, sorts them, and then merges them back together. It is commonly applied in:

1. **Sorting large datasets** where efficient sorting is required, especially with linked lists.
2. **Sorting arrays with guaranteed O(n log n) time complexity, even in the worst case.**
3. **Handling datasets that may not fit entirely into memory (e.g., external sorting).**
4. **Sorting elements in parallel processing environments (as it is well-suited for divide-and-conquer strategies).**
5. **Solving problems that involve merging multiple sorted arrays or lists.**

---

### 🔥 **Optimization Strategy**  
- **Divide the array into two halves and recursively sort each half.**
- **Merge the two sorted halves together using a linear scan.**
- **Merge Sort has a guaranteed time complexity of O(n log n), making it one of the most efficient sorting algorithms for large datasets.**
- **Merge Sort is stable, meaning equal elements retain their relative order after sorting.**
- **It is not in-place, requiring extra memory for merging (O(n) space complexity).**

---

## 🟢 **7 Easy Problems (Merge Sort)**
1. **Sort an Array Using Merge Sort**
2. **Merge Two Sorted Arrays**
3. **Sort a Linked List Using Merge Sort**
4. **Merge Sort for Sorting Large Datasets**
5. **Find the Median of Two Sorted Arrays Using Merge Sort**
6. **Count Inversions in an Array Using Merge Sort**
7. **Sort an Array of Strings (Lexicographical Order) Using Merge Sort**

---

## 🟡 **5 Medium Problems (Merge Sort)**
1. **Implement Merge Sort with Recursive and Iterative Approaches**
2. **Merge Sort for Sorting Large Data that Does Not Fit in Memory**
3. **Find the Kth Smallest Element in a Sorted Array Using Merge Sort**
4. **Merge Sorted Subarrays in O(n log n) Time Using Merge Sort**
5. **Sorting an Array with Duplicate Values Using Merge Sort**

---

## 🔴 **3 Hard Problems (Merge Sort)**
1. **Find the Median of Two Sorted Arrays in O(log n) Time**
2. **Merge Sort for K Sorted Lists**
3. **External Sorting for Sorting Large Files with Limited Memory**

---

**Merge Sort is an efficient, stable sorting algorithm with consistent O(n log n) performance, making it suitable for large datasets, sorting linked lists, and parallel sorting.** 🚀 Let me know if you need explanations!