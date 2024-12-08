# Strobogrammatic Number

## Description

A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (flipped upside down). For example, in a digital clock or calculator display, some digits (like 6 and 9) can rotate to form valid numbers, while others cannot.

### Rules:
1. The number should remain valid after being rotated upside down.
2. Only specific digits are valid when rotated:
   - **0, 1, 8**: These digits remain the same when rotated.
   - **6, 9**: These digits flip into each other (6 becomes 9, and vice versa).

### Invalid digits:
   - **2, 3, 4, 5, 7**: These digits cannot form valid numbers when rotated.

---

## Examples

1. **Single-digit numbers:**
   - Valid: `0, 1, 8`
   - Invalid: `2, 3, 4, 5, 6, 7, 9`

2. **Multi-digit numbers:**
   - Valid: `69, 88, 818, 609`
     - `69`: Rotates to `96` (valid).
     - `88`: Rotates to `88` (valid).
     - `818`: Rotates to `818` (valid).
     - `609`: Rotates to `906` (valid).
   - Invalid: `123, 675, 702`
     - `123`: Contains invalid digits (`2` and `3`).
     - `675`: Contains invalid digits (`7` and `5`).
     - `702`: Contains invalid digits (`2` and `7`).

---

### Checking Strobogrammatic Property
To check if a number is strobogrammatic:
1. Map each digit to its rotated counterpart:
   - `0 ↔ 0`, `1 ↔ 1`, `8 ↔ 8`, `6 ↔ 9`, `9 ↔ 6`
2. Reverse the digits of the number.
3. Replace each digit with its rotated counterpart.
4. Compare the transformed number with the original.

---

## Applications
- **Digital Displays**: Helps in designing numbers for clocks, calculators, or LED signs that maintain readability when rotated.
- **Puzzle Problems**: Frequently appears in coding challenges and interviews.

### Implementation in Java

```java

import java.util.HashMap;
import java.util.Scanner;

public class Stobogramatic_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Num=sc.nextLine();
        if(Strobo(Num)){
            System.out.println("It is a Strobogrmmatic Number");
        }else {
            System.out.println("It is not a Strobogrammatic Number");
        }
    }
    static boolean Strobo(String Num){
        HashMap<Character,Character> Dict=new HashMap<>();
        Dict.put('0','0');
        Dict.put('1','1');
        Dict.put('8','8');
        Dict.put('6','9');
        Dict.put('9','6');
        String New="";
        for(int i=0;i<Num.length();i++){
            if(!Dict.containsKey(Num.charAt(i))){
                return false;
            }
            else{
                New=Dict.get(Num.charAt(i))+New;
            }
        }
//        System.out.println(New+" "+Num);
        if(!Num.equals(New)){
            return false;
        }
        return true;
    };
}

```
### Implementation in C++

```Cpp
#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

// Function to check if a number is strobogrammatic
bool isStrobogrammatic(string num) {
    unordered_map<char, char> strobogrammaticMap = {
        {'0', '0'}, {'1', '1'}, {'8', '8'}, {'6', '9'}, {'9', '6'}
    };

    int left = 0, right = num.length() - 1;

    while (left <= right) {
        if (strobogrammaticMap.find(num[left]) == strobogrammaticMap.end() || 
            strobogrammaticMap[num[left]] != num[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

int main() {
    string num;
    cout << "Enter a number: ";
    cin >> num;

    if (isStrobogrammatic(num)) {
        cout << num << " is a strobogrammatic number." << endl;
    } else {
        cout << num << " is not a strobogrammatic number." << endl;
    }

    return 0;
}

```
### Implementation in Python

```python

def is_strobogrammatic(num):
    # Map of strobogrammatic pairs
    strobogrammatic_map = {'0': '0', '1': '1', '8': '8', '6': '9', '9': '6'}

    left, right = 0, len(num) - 1

    while left <= right:
        if num[left] not in strobogrammatic_map or strobogrammatic_map[num[left]] != num[right]:
            return False
        left += 1
        right -= 1

    return True

# Input from the user
num = input("Enter a number: ")

if is_strobogrammatic(num):
    print(f"{num} is a strobogrammatic number.")
else:
    print(f"{num} is not a strobogrammatic number.")


```
