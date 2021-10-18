# Мультимножество

* Множество, допускающее включение одного и того же элемента по нескольку раз

# Требования

* Необходимо написать класс `HashMultiset`, реализующий интерфейс `Multiset` с учетом комментариев
* Стандартные операции коллекций (`add`/`contains`/`remove` и т.д.) должны работать за то же время, что и аналогичные методы в `java.util.HashSet`
* Java Stream API использовать нельзя

---

# Подробности

* множество должно позволять хранить `null`
* `remove` удаляет только одно вхождение объекта
* `size` возвращает общее количество вхождений
* В возвращаемом `Set<Entry<E>>` должны быть реализованы только `iterator` и `size`
* Все возвращаемые итераторы должны поддерживать методы `hasNext`/`next`/`remove`
* Все возвращаемые итераторы должны обходить элементы в порядке их добавления

---

# Примечания

* См. `LinkedHash*`
* См. `Abstract*`
* Реализации методов в `Abstract*` не всегда удовлетворяют требуемой асимптотике
* Некоторые реализации методов в `Abstract*` бросают `UnsupportedOperationException`