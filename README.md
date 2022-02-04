# IsAltInKotlin

定義 isAlt 函式判斷 string 是否為子音與母音交錯

## 我的解法

```kotlin
fun isAlt(input: String): Boolean {
    // 找出所有沒有交替出先的 string, 也就是連續出現 vowel 或是 非 vowel 之外的字
    val nonAltReg = Regex("[aeiou]{2}|[^aeiou]{2}")
    return !nonAltReg.containsMatchIn(input)
}
```

## Reference from Recca Chao's solution

[Recca Chao's solution](https://gitpage.reccachao.net/kotlin/kata/are-we-alternate/)