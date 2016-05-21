# DesignPattern(设计模式)
这个工程是《Head First设计模式》书本里面涉及到的例程代码源码

##1.Strategy(策略模式)
策略设计模式就是定义算法族（接口中定义的方法<也就是对象的行为>），分别进行封装（接口实现类），让他们之间可以相互替换（通过组合的方式绑定到调用对象上），以此来达到算法的变化（更改方法的具体实现） 独立于使用算法的对象的目的。

##2.Observer(观察者模式)
观察者模式：定义了对象之间的一对多依赖（在主题类中，注册观察者类），这样一来，当一个对象（Subject主题）改变状态时，它的多有依赖者（Observer观察者）都会收到通知并自动更新。
Java提供了观察者模式的实现，通过继承Observale类（主题类），实现Observer接口（观察者类）来实现观察者模式。

##3.Decorator(装饰器模式)
装饰器模式：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比集成更有弹性的替代方案。
在装饰器模式中，每个组件都可以单独使用，或者被装饰者包装起来使用。
##4.Factory(工厂模式)
所有工厂模式都用来封装对象的创建。
	###a.工厂方法模式
	定义：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。工厂方法模式能够封装具体类型的实例化。
	工厂方法模式通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。有一个创建者类，负责定义一个抽象的工厂方法，让子类实现此方法创建对象。创建者类通常包含依赖于抽象产品的代码，而这些抽象产品由子类制造。创建者不需要真的知道在创建哪些具体的产品。能够产生产品的类称为具体创建者。产品类是工厂生产的产品。
	###b.抽象工厂模式
	定义：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

##5.Singleton(单例模式)
单例模式:确保一个类只有一个实例,并提供一个全局访问点。
##6.Command(命令模式)
命令模式:将"请求"封装成对象,以便使用不同的请求,队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
##7.Adapter(适配器模式)
适配器模式:将一个类的接口,转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
##8.Facade(外观模式)
外观模式:提供了一个统一的接口,用来访问子系统中的一群接口。外观定义了一个高层接口,让子系统更容易使用。
##9.Template(模版模式)
模版模式:在一个方法中定义一个算法的骨架,而将一些步骤延迟到子类中。模版方法使得子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤。
##10.Iterator(迭代器模式)
迭代器模式:提供一种方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的表示。
##11.Composite(组合模式)
组合模式:允许你将对象组合成树状结构来表现"整体/部分"层次结构。组合能让客户以一致的方式处理个别对象以及对象组合。
##12.State(状态模式)
