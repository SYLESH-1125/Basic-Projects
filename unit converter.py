print()
print("UNIT CONVERTER")
print()
conversion_ava=[(1,'km','mi'),
                 (2,'mi','km'),
                 (3,'kg','lbs'),
                 (4,'lbs','kg'),
                 (5,'F','C'),
                 (6,'C','F')]
print('Conversions avaliable')
print()
for conversion_num,from_unit,to_unit in conversion_ava:
    print(f'{conversion_num}.){from_unit}->{to_unit}')
print()
conversion=input('Enter the number of the conversion to use: ')
conversion_index=int(conversion)-1
conversion_num,from_unit,to_unit=conversion_ava[conversion_index]
print()
from_value=float(input(f'Enter {from_unit}--> '))
print()
if conversion_num==1:
    to_value=from_value*0.62
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')
elif conversion_num==2:
    to_value=from_value*1.61;
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')
elif conversion_num==3:
    to_value=from_value*2.2;
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')
elif conversion_num==4:
    to_value=from_value*0.45;
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')
elif conversion_num==5:
    to_value=(from_value-32)/1.8;
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')
elif conversion_num==6:
    to_value=from_value*1.8+32;
    print(f'{from_value}{from_unit}-->{to_value}{to_unit}')


   






