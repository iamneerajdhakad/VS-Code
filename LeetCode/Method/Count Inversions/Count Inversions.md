### 📌 **When to Use the Count Inversions Approach?**  
The **Count Inversions** technique is useful when solving problems related to **sorting** and **order preservation**. An inversion in an array is a pair of indices \(i, j\) such that \(i < j\) and \(arr[i] > arr[j]\). It is commonly applied in:  

1. **Counting the number of inversions in an array.**  
2. **Determining the degree of unsortedness in an array.**  
3. **Improving merge sort to count inversions while sorting.**  
4. **Checking if a sequence can be sorted by a limited number of swaps.**  
5. **Solving problems related to the number of pairs in an array that are out of order.**  

---

### 🔥 **Optimization Strategy**  
- **Use a modified Merge Sort to count inversions while sorting the array in O(N log N) time.**  
- **For each element in the array, count how many subsequent elements are smaller than it.**  
- **For brute force, use a nested loop to check each pair of elements, but optimize it using merge sort for better performance.**  
- **When elements are already close to sorted, a more efficient method can reduce unnecessary comparisons.**  

---

## 🟢 **7 Easy Problems (Count Inversions)**
1. **Count Inversions in an Array Using Brute Force (Nested Loops)**  
2. **Count Inversions in an Array Using Merge Sort**  
3. **Check if an Array Can Be Sorted with At Most One Swap**  
4. **Count the Number of Smaller Elements After Each Element (Using Merge Sort)**  
5. **Find the Number of Pairs with a Given Sum in an Array**  
6. **Count the Inversions in a Sorted Array**  
7. **Find Inversions in an Array Using an Enhanced Merge Sort**  

---

## 🟡 **5 Medium Problems (Count Inversions)**
1. **Count the Number of Inversions in a Rotated Sorted Array**  
2. **Count the Number of Inversions in a 2D Matrix (Row-wise Sorted Matrix)**  
3. **Find the Number of Pairs (i, j) such that arr[i] > arr[j] and arr[i] is divisible by arr[j]**  
4. **Find the Minimum Number of Swaps to Sort an Array (Using Inversions Count)**  
5. **Count the Number of Inversions in a Stream of Elements (Using a Balanced Binary Search Tree)**  

---

## 🔴 **3 Hard Problems (Count Inversions)**
1. **Count Inversions in a Large Dataset (Efficient Merge Sort Application)**  
2. **Count the Number of Inversions with Constraints on the Number of Swaps**  
3. **Count Inversions in an Array with Duplicate Elements and Queries**  

---

**Count Inversions is a classic problem that helps in understanding sorting algorithms and the idea of pairwise comparisons within an array.** 🚀 Let me know if you need explanations!