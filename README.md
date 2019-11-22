# Forecast Chart

A forecast chart builder using MPAndroidChart library with reactive view and writed in Kotlin.

## Add as dependency

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency

```gradle
dependencies {
    implementation 'com.github.oxeanbits.forecast-chart:v1.0.0'
}
```

## Example

![forecast-chart](https://user-images.githubusercontent.com/13650290/69423053-f255e580-0d03-11ea-83a4-54f62bc9deca.gif)

## Basic usage

```kotlin
val expected = Line(arrayListOf(Entry(1f, 1f), Entry(2f, 2f)), "Expected", Color.BLUE, "m³")
val actual = Line(arrayListOf(Entry(1f, 1f)), "Actual", Color.GREEN, "m³")

forecastChartComponent{
    size(MATCH, 350)
    loadForecastChart(
        expected,
        actual
    )
}
```

## References

- 100% Kotlin based
- [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)
- [Anvil](https://github.com/anvil-ui/anvil)

## MIT License

Copyright (c) 2019 Oxeanbits

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
