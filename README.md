# Amazing Spinner [![](https://jitpack.io/v/Mamoon-Alhawamdeh/AmazingSpinner.svg)](https://jitpack.io/#Mamoon-Alhawamdeh/AmazingSpinner)

Android Spinner support hint

# Demo
![alt text](https://github.com/Mamoon-Alhawamdeh/Amazing_Spinner/blob/master/demo/demo.gif)

## Adding to project

### Gradle
Add below code to your **root** `build.gradle` file

```gradle
allprojects {
    repositories {
        jcenter()
    }
}
```
And add the following dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
    implementation 'com.github.Mamoon-Alhawamdeh:AmazingSpinner:${latest-version}"
}
```

## Usage
```xml
<com.google.android.material.textfield.TextInputLayout
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox.ExposedDropdownMenu"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp">

        <com.rosemaryapp.amazingspinner.AmazingSpinner
            style="@style/Widget.MaterialComponents.AutoCompleteTextView.OutlinedBox"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="hint"/>

    </com.google.android.material.textfield.TextInputLayout>
```

### OR
```xml
<com.rosemaryapp.amazingspinner.AmazingSpinner
        style="@style/Widget.AppCompat.Spinner.Underlined"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        android:hint="hint"/>
```
### Customization

You can use `TextInputLayout` styles and properties or `Spinner` styles and properties.

## Find this library useful? :heart:
Support it by joining __[stargazers](https://github.com/Mamoon-Alhawamdeh/Amazing_Spinner/stargazers)__ for this repository. :star:


# License
```
MIT License

Copyright (c) 2020 Mamoon Al-hawamdeh

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
```
