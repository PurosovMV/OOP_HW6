## Задача
Продемонстрировать применение принципов SOLID на примере домашнего задания из предыдущего семинара.

## Реализация

1. Реализован принцип Dependency Inversion Principle - зависимости внутри системы строятся на основе абстракций.
Класс User сделан абстрактным и не зависит от классов наследников Student, Teacher.
Классы наследники зависят от данного абстрактного класса.
2. Добавлен класс StudentHostel в котором реализованы следующие принципы:
 
   * Single Responsibility Principle - класс отвечает только за формирование комнат в общежитии;
   * Open-Closed Principle - программные сущности (классы, модули, функции и т.п.) должны быть открыты для расширения, но закрыты для изменения.
3. Реализован принцип Interface Segregation Principle - все интерфейсы модуля service узконаправленные и используются для конкретных клиентов.