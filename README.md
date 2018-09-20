# NumberTipView

## 引用方法
	1.在项目的Gradle文件
		allprojects {
		repositories {
			.......
			maven { url 'https://jitpack.io' }
		}
	}
	2.在你要用这个控件的模块gradle文件
		implementation 'com.github.NotSeriousCoder:NumberTipView:{lastversion}'
	
lastversion目前是1.0.0	

## 使用方法
	1.
	<com.bingor.numbertipview.NumTipView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#112233"
        app:max_num="99"
		app:min_num="0"
        app:min_gone="true"        
        app:text_color="#ffff13"
        app:text_size="10sp"
        app:hor_padding="15dp"
        app:ver_padding="15dp" />
		
		background--背景颜色
		max_num--最大值（不设置默认99）
		min_num--最小值（不设置默认0）
		min_gone--达到最小值控件是否隐藏
		hor_padding/ver_padding--横向/纵向padding
		
	2.代码里面需要setNum(num)给一个初始值，否则看不到效果
	
	
## Bug反馈
	请在Github直接提，或者邮箱找我710267819@qq.com
	
	
	
	
	
	
	
	
