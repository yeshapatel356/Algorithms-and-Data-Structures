# Asymptotic Notation - Runtime of algorithm

## Big - Oh - Worst case

## Big Theta - Θ - Best Case

## Big Omega - Ω - Average Case

### The common algorithmic runtimes from fastest to slowest are:

- constant: Θ(1)
- logarithmic: Θ(log N)
- linear: Θ(N)
- polynomial: Θ(N^2)
- exponential: Θ(2^N)
- factorial: Θ(N!)



## Separate Chaining vs. Open Addressing

| S.No. | Separate Chaining | Open Addressing |
|---|---|---|
| 1. | Implementation Simplicity | Computation Cost |
| | Simpler to implement | Requires more computation for probing |
| 2. | Handling Full Table | Maximum Size |
| | Table can always grow with chains | Table can become full, limiting insertions |
| 3. | Sensitivity | Load Factor and Hash Function |
| | Less sensitive | Requires careful consideration to avoid clustering |
| 4. | Use Cases | Unknown Key Patterns | Known Key Patterns |
| | Preferred when number and frequency of insertions/deletions are unknown | Suitable when key frequency and number are known |
| 5. | Cache Performance | Limited by Linked Lists | Potentially Better Cache Utilization |
| | Keys stored in linked lists can hinder cache efficiency | Everything stored in the table for better potential cache locality |
| 6. | Space Wastage | Unused Parts in Hash Table | Efficient Space Usage |
| | Some parts of the table might remain unused due to chaining | Slots can be used even if not directly mapped by a key (probing) |

