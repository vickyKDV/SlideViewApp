# SlideViewApp

[![](https://jitpack.io/v/vickyKDV/SlideViewApp.svg)](https://jitpack.io/#vickyKDV/SlideViewApp)


# Expand View
Library SlideView

![alt text](https://raw.githubusercontent.com/vickyKDV/SlideViewApp/master/Screenrecorder-2020-09-10-03-18.gif)


### Implementation
    allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
    
    dependencies {
	        implementation 'com.github.vickyKDV:SlideViewApp:0.1'
	}

### How to Used
        final FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RelativeLayout rl = findViewById(R.id.rl);
                SlideView.right2Left(ProviderDetailPage.this, rl);
            }
        });
    
        
        
   ### Code by vickykdv (https://github.com/vickyKDV) 
