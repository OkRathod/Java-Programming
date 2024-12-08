

# Euler's Totient Function (\(phi(n)))

## Description

Euler's Totient Function, denoted as \(phi(n)), counts the number of integers from \(1\) to \(n\) that are **relatively prime** to \(n\). Two numbers are relatively prime if their **greatest common divisor (GCD)** is \(1\).

### Key Properties:
1. \(phi(1) = 1)
2. If \(n\) is a prime number, \(phi(n) = n - 1).
3. For two coprime integers \(a\) and \(b\):  
   \[
   phi(a . b) = phi(a) . phi(b)
   ]
4. \(phi(n)) formula:
   
   ![image](https://github.com/user-attachments/assets/8049f758-8bd3-47b1-931c-2aa9cc17af01)
   
   where \(p\) runs over all distinct prime factors of \(n\).

---

## Example

![image](https://github.com/user-attachments/assets/7da521d9-94b4-49bd-b84c-06543d150dab)


---

## Code Implementation

### Java (Brute Force)

```java
import java.util.Scanner;

public class Euler_Phi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Result=N;
        for(int i=0;i<N;i++){
            if(gcd(N,i)!=1){
                Result--;
            }
        }
        System.out.println(Result);
    }
    static int gcd(int a, int b){
        if (a < b){
            return gcd(b,a);
        }
        if(b==0){
            return a;
        }
        return gcd(b,a % b);
    }
}


```
### Java (Better Solution)

```java
// [(Better Solution)]

import java.util.Scanner;

public class Euler_Phi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Result=N;
        //Euler Phi Function
        for(int i=2;i*i<=N;i++){
          if(N%i==0){
              // Check For all The Prime Factors
              while(N%i==0){
                  N=N/i;
                  //Remove the number multiple of Prime Factor
              }
              // Remove those from Result also
              Result=Result-Result/i;
          }
        }
        if(N>1){
            //Subtract the final Number from the Result
            Result=Result-Result/N;
        }
        System.out.println(Result);
    }
}

```

### Python
```python
def euler_phi(n):
    result = n
    p = 2
    while p * p <= n:
        if n % p == 0:
            while n % p == 0:
                n //= p
            result -= result // p
        p += 1
    if n > 1:
        result -= result // n
    return result

# Example Usage
n = 10
print(f"Euler's Totient Function φ({n}) = {euler_phi(n)}")
```

### C++
```cpp
#include <iostream>
using namespace std;

int euler_phi(int n) {
    int result = n;
    for (int p = 2; p * p <= n; ++p) {
        if (n % p == 0) {
            while (n % p == 0)
                n /= p;
            result -= result / p;
        }
    }
    if (n > 1)
        result -= result / n;
    return result;
}

int main() {
    int n = 10;
    cout << "Euler's Totient Function φ(" << n << ") = " << euler_phi(n) << endl;
    return 0;
}
```

---

## Output
For \(n = 10\):  
```
Euler's Totient Function φ(10) = 4
```

---

## Applications
1. **Cryptography**: Essential in RSA encryption.
2. **Number Theory**: Used in modular arithmetic and group theory.
3. **Relatively Prime Counting**: Determines integers coprime to a given number.
