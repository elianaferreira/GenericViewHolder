# GenericViewHolder
Don't write more ViewHolder classes. A class to use as your unique ViewHolder to use with RecyclerView.Adapter

## Download
Downlaod the lasted version via Gradle.
1. Add the JitPack repository to your build file. Add it in your root `build.gradle` at the end of repositories:
```groovy
allprojects {
	repositories {
		...
		google()
		maven { url 'https://jitpack.io' }
	}
}
````
2. Add the dependency:
```groovy
implementation 'com.github.elianaferreira:genericviewholder:2.0.0'
```

## Usage
### Adapter
Use this class in your adapter:
```java
public class Adapter extends RecyclerView.Adapter<GenericViewHolder>
```

### Inflating
In the method `onCreateViewHolder`, inflate the ViewHolder in the same way you normally inflate your viewholder.

```java
View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
return new GenericViewHolder(view);
```

### Referencing items of the view
To the `get` method of the viewholder, pass as parameters the ID of the element in your layout and the class of the element. No cast needed. This method returns a view of the same class referenced by the second parameter.

```java 
holder.get(R.id.item_img, ImageView.class)
holder.get(R.id.item_txt, TextView.class)
```


## License

MIT

