//
//    public void add(int index, E element) {               передаем в метод add номер индекса и элемент для добавления
//        rangeCheckForAdd(index);                          проверяем поля чтобы не словить исключение
//        modCount++;                                       фиксируем что произведено изменение
//        final int s;                                      инициализируем промежуточную переменную
//        Object[] elementData;
//        if ((s = size) == (elementData = this.elementData).length)  в случае если размер списка переполнется >>>
//            elementData = grow();                                   >>> при добавлении элемента увеличиваем размер списка методом grow
//        System.arraycopy(elementData, index,                        используем метод быстрого сдвига индексов списка на +1
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;                               присваиваем индексу списка переданный в метод add элемент
//        size = s + 1;                                               увеличиваем переменную характеризующую размер списка
//    }
//
//    public void clear() {
//        modCount++;                                           фиксируем что произведено изменение
//        final Object[] es = elementData;                      переопределяем список
//        for (int to = size, i = size = 0; i < to; i++)        проходимся по всему списку
//            es[i] = null;                                     и присваиваем элементам списка null т.е. удаляем
//    }
//
//    public E get(int index) {                         передаем методу индекс который нужно вернуть
//        Objects.checkIndex(index, size);              проверяем поля чтобы не словить исключение
//        return elementData(index);                    возвращаем элемент списка под индексом
//    }
//
//    public E set(int index, E element) {              передаем в метод индекс списка и значение элемента которое нужно прописать затерев существующий
//        Objects.checkIndex(index, size);              проверяем поля чтобы не словить исключение
//        E oldValue = elementData(index);              присвоение возвращаемого сеществующего элемента списка
//        elementData[index] = element;                 присвоение элементу списка под индексом переданного значения
//        return oldValue;                              возвращаем замененный элемент
//    }
//
//        public E remove(int index) {                                            передаем в метод индекс элемента который нужно удалить
//                Objects.checkIndex(index, size);                                проверяем поля чтобы не словить исключение
//                final Object[] es = elementData;                                создаем неизменяемый массив
//                @SuppressWarnings("unchecked") E oldValue = (E) es[index];      присваиваем элемент под индексом переменной для возвращения
//                fastRemove(es, index);                                          передаем значения полей в метод fastRemove
//                return oldValue;                                                после выполнения метода возвращаем значение удаленного элемента
//                }
//        private void fastRemove(Object[] es, int i) {                 принимаем значение полей от метода remove
//                modCount++;                                           фиксируем что произведено изменение
//                final int newSize;                                    создаем промежуточную переменную
//                if ((newSize = size - 1) > i)                         если величина списка больше индеска который нужно удалить и есть возможность сдвига на 1
//                System.arraycopy(es, i + 1, es, i, newSize - i);      успользуем метод быстрого сдвига индексов списка
//                es[size = newSize] = null;                            присваиваем null последнему элементу списка
//                }
//
