# diy-dev-diary-server

個人開発用日記アプリのサーバー

# Database

```
Table users {
  id int [pk, increment]
  name varchar [not null]
  email varchar [not null]
  created_at datetime [not null]
  updated_at datetime [not null]
}

Table products {
  id int [pk, increment]
  name varchar [not null]
  description varchar
  url varchar
  created_at datetime [not null]
  updated_at datetime [not null]
}

Table development {
  id int [pk, increment]
  user_id int [not null]
  product_id int [not null]
  created_at datetime [not null]
  updated_at datetime [not null]
}

Ref: users.id > development.user_id
Ref: products.id > development.product_id

Table diary {
  id int [pk, increment]
  date int [not null]
  page_html varchar
  created_at datetime [not null]
  updated_at datetime [not null]
}

Table recording {
  id int [pk, increment]
  product_id int [not null]
  diary_id int [not null]
  created_at datetime [not null]
  updated_at datetime [not null]
}

Ref: products.id > recording.product_id
Ref: diary.id > recording.diary_id

```

[dbdiagram](https://dbdiagram.io)で作成
