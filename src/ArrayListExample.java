
//    public void add(int index, E element) {               �������� � ����� add ����� ������� � ������� ��� ����������
//        rangeCheckForAdd(index);                          ��������� ���� ����� �� ������� ����������
//        modCount++;                                       ��������� ��� ����������� ���������
//        final int s;                                      �������������� ������������� ����������
//        Object[] elementData;
//        if ((s = size) == (elementData = this.elementData).length)  � ������ ���� ������ ������ ������������ >>>
//            elementData = grow();                                   >>> ��� ���������� �������� ����������� ������ ������ ������� grow
//        System.arraycopy(elementData, index,                        ���������� ����� �������� ������ �������� ������ �� +1
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;                               ����������� ������� ������ ���������� � ����� add �������
//        size = s + 1;                                               ����������� ���������� ��������������� ������ ������
//    }
//
//    public void clear() {
//        modCount++;                                           ��������� ��� ����������� ���������
//        final Object[] es = elementData;                      �������������� ������
//        for (int to = size, i = size = 0; i < to; i++)        ���������� �� ����� ������
//            es[i] = null;                                     � ����������� ��������� ������ null �.�. �������
//    }
//
//    public E get(int index) {                         �������� ������ ������ ������� ����� �������
//        Objects.checkIndex(index, size);              ��������� ���� ����� �� ������� ����������
//        return elementData(index);                    ���������� ������� ������ ��� ��������
//    }
//
//    public E set(int index, E element) {              �������� � ����� ������ ������ � �������� �������� ������� ����� ��������� ������� ������������
//        Objects.checkIndex(index, size);              ��������� ���� ����� �� ������� ����������
//        E oldValue = elementData(index);              ���������� ������������� ������������� �������� ������
//        elementData[index] = element;                 ���������� �������� ������ ��� �������� ����������� ��������
//        return oldValue;                              ���������� ���������� �������
//    }
//
//        public E remove(int index) {                                            �������� � ����� ������ �������� ������� ����� �������
//                Objects.checkIndex(index, size);                                ��������� ���� ����� �� ������� ����������
//                final Object[] es = elementData;                                ������� ������������ ������
//                @SuppressWarnings("unchecked") E oldValue = (E) es[index];      ����������� ������� ��� �������� ���������� ��� �����������
//                fastRemove(es, index);                                          �������� �������� ����� � ����� fastRemove
//                return oldValue;                                                ����� ���������� ������ ���������� �������� ���������� ��������
//                }
//        private void fastRemove(Object[] es, int i) {                 ��������� �������� ����� �� ������ remove
//                modCount++;                                           ��������� ��� ����������� ���������
//                final int newSize;                                    ������� ������������� ����������
//                if ((newSize = size - 1) > i)                         ���� �������� ������ ������ ������� ������� ����� ������� � ���� ����������� ������ �� 1
//                System.arraycopy(es, i + 1, es, i, newSize - i);      ���������� ����� �������� ������ �������� ������
//                es[size = newSize] = null;                            ����������� null ���������� �������� ������
//                }
//
