# 设计模式 -- 状态模式

### 定义

当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

### 使用场景

- 一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为。
- 代码中包含大量与对象状态有关的条件语句，例如，一个操作中含有庞大的多分支语句（if-else或switch-case），且这些分支依赖于该对象的状态。

总结: 状态模式将每一个条件分支放入一个独立的类中，这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖与其他对象而独立变化，这样通过多态去除过多的、重复的if-else等分支语句。

### UML 类图

![](https://github.com/mrlsm/Note/blob/master/designPatterns/images/state_uml.jpg)

由上图，状态模式 主要包含三种角色：
- Context：环境类，定义客户感兴趣的接口，维护一个State子类的实例，这个实例定义了对象的当前状态。
- State：抽象状态类或状态接口，定义一个或者一组接口，表示该状态下的行为。
- ConcreteStateA、ConcreteStateB：具体状态类，每一个具体的状态类实现抽象State中定义的接口，从而达到不同状态下的不同行为。

### 优缺点
- 优点：
    - 将所有与一个特定的状态相关的行为都放入一个状态对象中，它提供了一个更好的方法来组织与特定状态相关的代码，将繁琐的状态判断转换成结构清晰的状态类族，在避免代码膨胀的同时也保证了可扩展性与可维护性。
- 缺点：
    - 状态模式的使用必然会增加系统类和对象的个数。

### 备注

状态模式和策略模式的结构几乎完全一样，但它们的目的、本质却完全不一样。状态模式的行为是平行的、不可替换的，策略模式的行为是彼此独立、可相互替换的。用一句话来表述，状态模式把对象的行为包装在不同的状态对象里，每一个状态对象都有一个共同的抽象状态基类。状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。

##### 参考
[《Android源码设计模式解析与实战》](https://book.douban.com/subject/26644935/)

##### 备注
详细可见我的github [Note](https://github.com/mrlsm/Note)