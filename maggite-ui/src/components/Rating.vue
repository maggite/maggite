<template>
  <div class="rating">
    <ul class="list">
      <li class="star active"><icon name="star"/></li>
      <li class="star active"><icon name="star"/></li>
      <li class="star active"><icon name="star"/></li>
      <li class="star"><icon name="star-o"/></li>
      <li class="star"><icon name="star-o"/></li>
    </ul>
    <span>3 of 5</span>
  </div>
</template>
<style scoped>
  .rating {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    font-size: 14px;
    color: #a7a8a8;
  }
  .list {
    margin: 0 0 5px 0;
    padding: 0;
    list-style-type: none;
  }
  .list:hover .star {
    color: #f3d23e;
  }
  .star {
    display: inline-block;
    cursor: pointer;
    margin: 0 1px;
  }
  .star:hover ~ .star:not(.active) {
    color: inherit;
  }
  .active {
    color: #f3d23e;
  }
</style>
