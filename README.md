# DateTimeUtils 

This library is a package of functions that let you manipulate objects and or java date string. it combine the most common functions used when managing dates under android, such as converting a mysql /sqlLite date to a Date object and vis-versa etc.

This library is available under the [MIT License](http://www.opensource.org/licenses/mit-license.php).



## Usage

The DateTimeUtils library is available from [JitPack](https://jitpack.io/#thunder413/NetRequest/1.2).

First add JitPack dependency line in your project `build.gradle` file:

```xml
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

And then simply add the following line to the `dependencies` section of your app module `build.gradle` file:

```groovy
compile 'com.github.thunder413:DateTimeUtils:1.3'
```

Javadocs are available [here](http://https://github.com/thunder413/NetRequest/apidocs/index.html).

## Examples

### formatDate

``formatDate`` is a method that allow you to convert ``date object`` to ``string`` or ``timeStamp`` to date and vice-versa.

#### Date string to Date object 

```java
// MySQL/SQLite dateTime example
Date date = DateTimeUtils.formatDate("2017-06-13 04:14:49");
// Or also with / separator
Date date = DateTimeUtils.formatDate("2017/06/13 04:14:49");
// MySQL/SQLite date example
Date date = DateTimeUtils.formatDate("2017-06-13");
// Or also with / separator
Date date = DateTimeUtils.formatDate("2017/06/13");
```
#### Date object to date string MySQL/SQLite

```java
String date = DateTimeUtils.formatDate(new Date());
```

#### timeStamp to Date object

By default it will considere given timeStamp in milliseconds but in case you did retrieve the timeStamp from server with use seconds supply ``DateTimeUnits.SECONDS`` to tell the fonction about

```java
// Using milliseconds
Date date = DateTimeUtils.formatDate(1497399731000);
// Using seconds (Server timeStamp)
Date date = DateTimeUtils.formatDate(1497399731,DateTimeUnits.SECONDS);
```

### formatWithStyle

``formatWithStyle``  allow to parse date into localized format using most common style

#### Date object to localized date

```java
DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.FULL); // Tuesday, June 13, 2017
DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.LONG); // June 13, 2017
DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.MEDIUM); // Jun 13, 2017
DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.SHORT); // 06/13/17
```

#### Date string to localized date

```java
DateTimeUtils.formatWithStyle("2017-06-13", DateTimeStyle.FULL); // Tuesday, June 13, 2017
DateTimeUtils.formatWithStyle("2017-06-13", DateTimeStyle.LONG); // June 13, 2017
DateTimeUtils.formatWithStyle("2017-06-13", DateTimeStyle.MEDIUM); // Jun 13, 2017
DateTimeUtils.formatWithStyle("2017-06-13", DateTimeStyle.SHORT); // 06/13/17
```

### formatWithPattern

``formatWithPattern`` allow to define your own parse pattern following  ``SimpleDateFormat`` scheme

#### Date string as source

```java
DateTimeUtils.formatWithPattern("2017-06-13", "EEEE, MMMM dd, yyyy"); // Tuesday, June 13, 2017
```

#### Date object as source

```java
DateTimeUtils.formatWithPattern(new Date(), "EEEE, MMMM dd, yyyy"); // Tuesday, June 13, 2017
```

 ### isToday

``isToday`` Tell whether or not a given date is today date 

```java
// Date object as source
boolean state = DateTimeUtils.isToday(new Date());
// Date String as source
boolean state = DateTimeUtils.isToday("2017-06-15 04:14:49");
```

### isYesterday

``isYesterday`` Tell whether or not a given date is yesterday date 

```java
// Date object as source
boolean state = DateTimeUtils.isYesterday(new Date());
// Date String as source
boolean state = DateTimeUtils.isYestrday("2017-06-15 04:14:49");
```

### getDateDiff

``getDateDiff`` give you the difference between two date in days, hours, minutes, seconds or milliseconds ``DateTimeUnits`` 

```java
// Dates can be date object or date string
Date date = new Date();
String date2 = "2017-06-13 04:14:49";
// Get difference in milliseconds
int diff = DateTimeUtils.getDateDiff(date,date2, DateTimeUnits.MILLISECONDS);
// Get difference in seconds
int diff = DateTimeUtils.getDateDiff(date,date2, DateTimeUnits.SECONDS);
// Get difference in minutes
int diff = DateTimeUtils.getDateDiff(date,date2, DateTimeUnits.MINUTES);
// Get difference in hours
int diff = DateTimeUtils.getDateDiff(date,date2, DateTimeUnits.HOURS);
// Get difference in days
int diff = DateTimeUtils.getDateDiff(date,date2, DateTimeUnits.DAYS);
```

### getTimeAgo

``getTimeAgo`` give ou the elapsed time since a given date, it also offer two print mode the full and short strings ``eg . 3 hours ago | 3h ago`` the strings are localized but at the moment on FR and EN are available if you need your langage to be add just let me know :)

```java
String timeAgo = DateTimeUtils.getTimeAgo(context,new Date()); // Full string style will be used
// Short string style
String timeAgo = DateTimeUtils.getTimeAgo(context,"new Date()",DateTimeStyle.AGO_SHORT_STRING ); 
```

### formatTime

``formatTime`` allow you to extract time from date by default it wont show the hours if equal to ``0`` but you can supply ``forceShowHours`` parameter to force hours display

```java
String time = DateTimeUtils.formatTime(new Date()); // 14:49 if hours equals 0 or 04:14:09 if hours witch is wrong when use it on time rather than a duration
// Solution >> force hours display
String time = DateTimeUtils.formatTime(new Date(),true);
// And you can also supplie a date string
String time = DateTimeUtils.formatTime("2017-06-13 04:14:49"); // 04:14:49
```

### millisToTime

``millisToTime`` is usefull when your dealing with duration and want to display for example player duration or current playback position into human readable value.

```java
String time = DateTimeUtils.millisToTime(2515); // It take millis as an argument not seconds
```

### timeToMillis

``timeToMillis`` allow to convert ``time`` string to ``millseconds`` 

```java
int milliseconds = DateTimeUtils.timeToMillis("14:20"); // 860000
```



## Author 

- **Thunder413** (https://github.com/thunder413)

## License

This project is licensed under the  [MIT License](http://www.opensource.org/licenses/mit-license.php) 