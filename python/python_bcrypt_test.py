from django.test import TestCase
# bcrypt 를 이용한 암호화 해제

import bcrypt

password = b'admin!@34'
hashed_password = b'$2a$10$aIxQoCmQn8x3CSMU3TfrfeoKm3K9DVOIkcukST/GUcSV8qz92ezI.'

matched = bcrypt.hashpw(password, hashed_password) == hashed_password
# true 가 나온다

# encode 를 해줘야 하는 경우
# python bcrypt 는 bytes string 형태로 되어있어야 한다.

not_encode_password = 'admin!@34'
not_encode_hashed_password = '$2a$10$aIxQoCmQn8x3CSMU3TfrfeoKm3K9DVOIkcukST/GUcSV8qz92ezI.'

matched2 = bcrypt.hashpw(not_encode_password.encode('utf-8'), not_encode_hashed_password.encode('utf-8')) == not_encode_hashed_password.encode('utf-8')
# true 가 나온다.