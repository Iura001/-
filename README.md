### Код скрипта ТЗ номер 1 

Ниже представлен код моего скрипта 

``` 
#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Использование: $0 входная_директория выходная_директория"
    exit 1
fi

input_dir=$1
output_dir=$2

mkdir -p "$output_dir"

while IFS= read -r -d $'\0' file; do
    base_name=$(basename "$file")
    target_file="$output_dir/$base_name"

    counter=1
    while [ -f "$target_file" ]; do
        target_file="${output_dir}/${base_name%.*}_$counter.${base_name##*.}"
        ((counter++))
    done

    cp "$file" "$target_file"
done < <(find "$input_dir" -type f -print0)

echo "Все файлы в $output_dir"
```

### Для запуска 

```sh tz1PostniiIurii233.sh <входная директория> <Выходная директория>```
