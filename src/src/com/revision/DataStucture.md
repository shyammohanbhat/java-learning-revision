# Java Data Structures Cheat Sheet 📝

---

## 1. Array
```java
int[] arr = new int[n];
arr[i]                    // access
arr.length                // size
Arrays.sort(arr)          // sort
Arrays.fill(arr, 0)       // fill
Arrays.copyOf(arr, n)     // copy
```

---

## 2. ArrayList
```java
List<Integer> list = new ArrayList<>();
list.add(val)             // add to end
list.add(i, val)          // add at index
list.get(i)               // access
list.set(i, val)          // update
list.remove(i)            // remove by index
list.remove(val)          // remove by value
list.size()               // size
list.contains(val)        // check exists
list.isEmpty()            // check empty
list.indexOf(val)         // find index
Collections.sort(list)    // sort
Collections.reverse(list) // reverse
```

---

## 3. LinkedList
```java
LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(val)    // add to front
ll.addLast(val)     // add to end
ll.removeFirst()    // remove front
ll.removeLast()     // remove end
ll.getFirst()       // view front
ll.getLast()        // view end
ll.size()           // size
ll.contains(val)    // check exists
```

---

## 4. Stack
```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(val)     // add to top    → offerFirst()
stack.pop()         // remove top    → pollFirst()
stack.peek()        // view top      → peekFirst()
stack.isEmpty()     // check empty
stack.size()        // size
```

---

## 5. Queue
```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(val)    // add to back
queue.poll()        // remove front
queue.peek()        // view front
queue.isEmpty()     // check empty
queue.size()        // size
```

---

## 6. Deque (Double Ended Queue)
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.offerFirst(val)   // add to front
deque.offerLast(val)    // add to back
deque.pollFirst()       // remove front
deque.pollLast()        // remove back
deque.peekFirst()       // view front
deque.peekLast()        // view back
deque.isEmpty()         // check empty
deque.size()            // size
```

> 💡 **Remember:** `ArrayDeque` can act as Stack, Queue, or Deque!
> - Stack  → use `push / pop / peek` (operates on FRONT)
> - Queue  → use `offerLast / pollFirst`
> - Deque  → use both ends freely

---

## 7. HashMap
```java
Map<Integer, Integer> map = new HashMap<>();
map.put(key, val)                   // add/update
map.get(key)                        // get value
map.getOrDefault(key, default)      // get or default
map.containsKey(key)                // check key exists
map.containsValue(val)              // check value exists
map.remove(key)                     // remove
map.size()                          // size
map.isEmpty()                       // check empty
map.keySet()                        // all keys
map.values()                        // all values
map.entrySet()                      // all key-value pairs

// Iterate
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int val = entry.getValue();
}
```

---

## 8. HashSet
```java
Set<Integer> set = new HashSet<>();
set.add(val)        // add
set.remove(val)     // remove
set.contains(val)   // check exists
set.size()          // size
set.isEmpty()       // check empty

// Iterate
for (int val : set) { }
```

---

## 9. TreeMap (Sorted by Key)
```java
TreeMap<Integer, Integer> map = new TreeMap<>();
map.put(key, val)       // add/update
map.get(key)            // get value
map.firstKey()          // smallest key
map.lastKey()           // largest key
map.floorKey(key)       // largest key ≤ given
map.ceilingKey(key)     // smallest key ≥ given
map.higherKey(key)      // smallest key > given
map.lowerKey(key)       // largest key < given
map.containsKey(key)    // check key
map.remove(key)         // remove
```

---

## 10. TreeSet (Sorted Unique Values)
```java
TreeSet<Integer> set = new TreeSet<>();
set.add(val)            // add
set.remove(val)         // remove
set.contains(val)       // check exists
set.first()             // smallest
set.last()              // largest
set.floor(val)          // largest ≤ given
set.ceiling(val)        // smallest ≥ given
set.higher(val)         // smallest > given
set.lower(val)          // largest < given
```

---

## 11. PriorityQueue (Heap)
```java
// Min Heap (default)
PriorityQueue<Integer> minPQ = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

// Custom Comparator
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

pq.offer(val)       // add
pq.poll()           // remove top (min/max)
pq.peek()           // view top
pq.size()           // size
pq.isEmpty()        // check empty
pq.contains(val)    // check exists
```

> 💡 **Remember:** Default is MIN heap → smallest at top!

---

## 12. String & StringBuilder
```java
// String (immutable)
String s = "hello";
s.length()              // length
s.charAt(i)             // char at index
s.substring(i, j)       // substring [i, j)
s.contains("lo")        // check contains
s.indexOf("l")          // find first index
s.replace("l", "r")     // replace all
s.split(" ")            // split by delimiter
s.toCharArray()         // convert to char array
s.toLowerCase()         // to lowercase
s.toUpperCase()         // to uppercase
s.trim()                // remove leading/trailing spaces
s.equals("hello")       // compare strings (not ==!)
Integer.parseInt(s)     // string → int
String.valueOf(n)       // int → string

// StringBuilder (mutable, faster for building strings)
StringBuilder sb = new StringBuilder();
sb.append(val)          // add to end
sb.insert(i, val)       // insert at index
sb.delete(i, j)         // delete range [i, j)
sb.reverse()            // reverse
sb.toString()           // convert to String
sb.length()             // length
sb.charAt(i)            // char at index
```

---

## Quick Reference — Which DS to Use? 🎯

| Situation | DS to Use |
|---|---|
| Fast lookup by key | `HashMap` |
| Unique values | `HashSet` |
| Sorted keys | `TreeMap` |
| Sorted unique values | `TreeSet` |
| LIFO (Last In First Out) | `Stack` → `ArrayDeque` |
| FIFO (First In First Out) | `Queue` → `LinkedList` |
| Both ends access | `Deque` → `ArrayDeque` |
| Top K elements | `PriorityQueue` |
| Level Order / BFS | `Queue` |
| Sliding Window | `Deque` |
| Building strings | `StringBuilder` |
| Graph adjacency | `HashMap<Integer, List<Integer>>` |

---

## Complexity Reference ⚡

| DS | Access | Search | Insert | Delete |
|---|---|---|---|---|
| Array | `O(1)` | `O(n)` | `O(n)` | `O(n)` |
| ArrayList | `O(1)` | `O(n)` | `O(1)`* | `O(n)` |
| LinkedList | `O(n)` | `O(n)` | `O(1)` | `O(1)` |
| HashMap | - | `O(1)` | `O(1)` | `O(1)` |
| HashSet | - | `O(1)` | `O(1)` | `O(1)` |
| TreeMap | - | `O(log n)` | `O(log n)` | `O(log n)` |
| PriorityQueue | - | `O(n)` | `O(log n)` | `O(log n)` |
| Stack/Queue/Deque | - | `O(n)` | `O(1)` | `O(1)` |

*ArrayList add to end is amortized O(1)

---

## Tree Traversals 🌳

| Traversal | Order | Uses |
|---|---|---|
| Inorder | Left → Root → Right | BST sorted order |
| Preorder | Root → Left → Right | Process root first |
| Postorder | Left → Right → Root | Process children first |
| Level Order | Level by Level | BFS, uses Queue |

```
Need children results first? → Postorder
Need to process root first?  → Preorder
Level by level?              → Level Order (Queue)
```

---

## Graph BFS Template 🕸️

```java
// 4 directions for grid problems
int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
//                    UP     DOWN  LEFT   RIGHT

void bfs(char[][] grid, int r, int c) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{r, c});
    grid[r][c] = '0';  // mark visited

    while (!queue.isEmpty()) {
        int[] curr = queue.poll();
        int row = curr[0];
        int col = curr[1];

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < grid.length &&
                newCol >= 0 && newCol < grid[0].length &&
                grid[newRow][newCol] == '1') {
                queue.offer(new int[]{newRow, newCol});
                grid[newRow][newCol] = '0';  // mark before adding!
            }
        }
    }
}
```

---

## Graph DFS Template 🕸️

```java
// Recursive DFS
void dfs(char[][] grid, int r, int c) {
    // bounds check + visited check
    if (r < 0 || r >= grid.length ||
        c < 0 || c >= grid[0].length ||
        grid[r][c] == '0') return;

    grid[r][c] = '0';  // mark visited

    // explore all 4 directions
    dfs(grid, r - 1, c);  // up
    dfs(grid, r + 1, c);  // down
    dfs(grid, r, c - 1);  // left
    dfs(grid, r, c + 1);  // right
}

// Iterative DFS (using Stack)
void dfs(char[][] grid, int r, int c) {
    Deque<int[]> stack = new ArrayDeque<>();
    stack.push(new int[]{r, c});
    grid[r][c] = '0';  // mark visited

    int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};

    while (!stack.isEmpty()) {
        int[] curr = stack.pop();
        int row = curr[0];
        int col = curr[1];

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < grid.length &&
                newCol >= 0 && newCol < grid[0].length &&
                grid[newRow][newCol] == '1') {
                stack.push(new int[]{newRow, newCol});
                grid[newRow][newCol] = '0';  // mark before pushing!
            }
        }
    }
}
```

> 💡 **BFS vs DFS:**
> | | BFS | DFS |
> |---|---|---|
> | DS Used | Queue | Stack / Recursion |
> | Shortest Path | ✅ Yes | ❌ No |
> | Explore All Paths | ❌ | ✅ Yes |
> | Level by Level | ✅ Yes | ❌ No |
> | Memory | More (stores level) | Less (stores path) |

---

## Monotonic Deque 📊

| Type | Order | Pop Condition | Front Gives |
|---|---|---|---|
| Decreasing | Large → Small | `back < new` | Maximum |
| Increasing | Small → Large | `back > new` | Minimum |

```
Need MAX in window? → Decreasing Deque
Need MIN in window? → Increasing Deque
```

---

## Monotonic Stack 📚

A stack that maintains elements in **increasing or decreasing order**.

| Type | Order | Pop Condition | Top Gives |
|---|---|---|---|
| Increasing | Small → Large | `top >= new` | Maximum |
| Decreasing | Large → Small | `top <= new` | Minimum |

### Increasing Monotonic Stack
```java
// keeps stack in increasing order → top is largest seen
Deque<Integer> stack = new ArrayDeque<>();

for (int i = 0; i < nums.length; i++) {
    // pop elements LARGER than current
    while (!stack.isEmpty() && stack.peek() >= nums[i]) {
        stack.pop();
    }
    stack.push(nums[i]);
}
```

### Decreasing Monotonic Stack
```java
// keeps stack in decreasing order → top is smallest seen
Deque<Integer> stack = new ArrayDeque<>();

for (int i = 0; i < nums.length; i++) {
    // pop elements SMALLER than current
    while (!stack.isEmpty() && stack.peek() <= nums[i]) {
        stack.pop();
    }
    stack.push(nums[i]);
}
```

### Common Use Cases
```
Next Greater Element  → Decreasing Stack
Next Smaller Element  → Increasing Stack
132 Pattern           → Decreasing Stack (reverse traversal)
Largest Rectangle     → Increasing Stack
Daily Temperatures    → Decreasing Stack
```

### Key Pattern — Next Greater Element
```java
int[] result = new int[nums.length];
Deque<Integer> stack = new ArrayDeque<>();  // stores indices

for (int i = 0; i < nums.length; i++) {
    while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
        int idx = stack.pop();
        result[idx] = nums[i];  // nums[i] is next greater for idx!
    }
    stack.push(i);  // store index not value!
}
// remaining in stack have no next greater → result stays 0
```

> 💡 **Key Reminders:**
> ```
> Monotonic Stack  → one end only (push/pop/peek)
> Monotonic Deque  → both ends (sliding window problems)
> Always store INDICES not values → to check window bounds!
> ```

---

*Happy Coding! 💪*